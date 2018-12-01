package robots;

public class TestMain {

    public static void main(String[] args) {
        Robot robot = new Robot();
        RobotController robotController = new RobotController();
        System.out.println("Сейчас робот в " + robot);
        robotController.moveRobot(robot, 4, 6);
        robotController.moveRobot(robot, 4, 9);
        robotController.moveRobot(robot, 2, 9);
        robotController.moveRobot(robot, 10, 3);
        robotController.moveRobot(robot, 10, 3);
    }
}
