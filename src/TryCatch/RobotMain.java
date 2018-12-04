package TryCatch;

public class RobotMain {
    public static void main(String[] args) {
        try {
            RobotController.moveRobot(new RobotImprovedManager(), 5, 7);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
