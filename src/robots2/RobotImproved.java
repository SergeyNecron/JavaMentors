package robots2;

public class RobotImproved implements RobotConnection, RobotConnectionManager {
    public static void main(String[] args) throws Exception {
        RobotImproved robotImproved = new RobotImproved();
        for (int i = 3; i > 0; i--) {
            try {
                robotImproved.getConnection();
                robotImproved.moveRobotTo(7, 8);
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

    @Override
    public void moveRobotTo(int x, int y) {
    }

    @Override
    public void close() {
    }

    @Override
    public RobotConnection getConnection() {
        return null;
    }
}
