package robots;

public class RobotController {

    private static void Povorot(Robot robot, Direction direction) {
        //повернуть робота в нужном направлении
        Direction directionRobot = robot.getDirection();
        if (direction == directionRobot) {
            return;
        }
        switch (directionRobot) {
            case RIGHT:
                switch (direction) {
                    case UP:
                        robot.turnLeft();
                        break;
                    case LEFT:
                        robot.turnRight();
                    case DOWN:
                        robot.turnRight();
                }
                break;
            case UP:
                switch (direction) {
                    case LEFT:
                        robot.turnLeft();
                        break;
                    case DOWN:
                        robot.turnRight();
                    case RIGHT:
                        robot.turnRight();
                }
                break;
            case LEFT:
                switch (direction) {
                    case UP:
                        robot.turnRight();
                        break;
                    case RIGHT:
                        robot.turnLeft();
                    case DOWN:
                        robot.turnLeft();
                }
                break;
            case DOWN:
                switch (direction) {
                    case RIGHT:
                        robot.turnLeft();
                        break;
                    case UP:
                        robot.turnRight();
                    case LEFT:
                        robot.turnRight();
                }
        }
    }

    private static void robotRun(Robot robot, int delta, Direction direction) {
        Povorot(robot, direction);
        for (int i = 0; i < delta; i++)
            robot.stepForward();
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        int deltaX = Math.abs(toX - x); // растояние которое нужно пройти по X
        int deltaY = Math.abs(toY - y); // растояние которое нужно пройти по Y

        System.out.println("Роботу нужно придти в точку " + toX + " " + toY);
        // если задано текущее положение не поворачивать зазря
        if (deltaX != 0) robotRun(robot, deltaY, toY > y ? Direction.UP : Direction.DOWN);
        if (deltaY != 0) robotRun(robot, deltaX, toX > x ? Direction.RIGHT : Direction.LEFT);

        System.out.println("Робот пришёл " + robot);
    }

}
