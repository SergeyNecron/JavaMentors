package robots2;

class RobotController {
    static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection robotImproved = null;
        for (int i = 3; i > 0; i--) {
            try {
                robotImproved = robotConnectionManager.getConnection();
                robotImproved.moveRobotTo(toX, toY);
                robotImproved.close();
                break;
            } catch (RobotConnectionException e) {
                System.out.println(i);
                if (i == 1) throw new RobotConnectionException("соединение неудачно", e);
            } catch (Exception e) {
                throw new RobotConnectionException("соединение неудачно", e);
            } finally {
                if (robotImproved != null) robotImproved.close();
            }
        }
    }
}
