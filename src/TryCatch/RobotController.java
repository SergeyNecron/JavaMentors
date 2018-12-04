package TryCatch;

class RobotController {
    static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 3; i > 0; i--) {
            try (RobotConnection robotImproved = robotConnectionManager.getConnection()) {
                robotImproved.moveRobotTo(toX, toY);
                break;
            } catch (RobotConnectionException e) {
                System.out.println(i);
                if (i == 1) throw e;
            }
        }
    }
}
