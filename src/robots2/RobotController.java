package robots2;

class RobotController {
    static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection robotImproved;
        for (int i = 3; i > 0; i--) {
            try {
                robotImproved = robotConnectionManager.getConnection();
                try {
                    robotImproved.moveRobotTo(toX, toY);
                    break;
                } catch (RobotConnectionException e) {
                    robotImproved.close();
                    throw new RobotConnectionException("ошибка попытки управления", e);
                } finally {
                    robotImproved.close();
                }
            } catch (RobotConnectionException e) {
                System.out.println(i);
                if (i == 1) throw new RobotConnectionException("соединение неудачно", e);
            }
        }
    }
}
