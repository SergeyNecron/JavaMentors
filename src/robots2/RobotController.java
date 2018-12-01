package robots2;

class RobotController {
    static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws Exception {
        RobotImproved robotImproved = new RobotImproved();
        for (int i = 3; i > 0; i--) {
            try {
                robotConnectionManager.getConnection();
                robotImproved.moveRobotTo(toX, toY);
                i = 0;
            } catch (Exception e) {
                robotImproved.close();
                throw new Exception(e);
            } catch (Throwable throwable) {
                if (i == 0) throw new RobotConnectionException("соединение неудачно", throwable);
            } finally {
                robotImproved.close();
            }
        }
    }
}
