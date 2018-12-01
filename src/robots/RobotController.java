package robots;

class RobotController {

    private static void povorot(Robot robot, Direction direction) {
        //повернуть робота в нужном направлении
        Direction directionRobot = robot.getDirection();
        if (direction == directionRobot) {
            return;
        }
        switch (directionRobot) {
            case RIGHT:
                switch (direction) {
                    case RIGHT:
                        break;
                    case UP:
                        robot.turnLeft();
                        break;
                    case LEFT:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                    case DOWN:
                        robot.turnRight();
                        break;
                }
                break;
            case UP:
                switch (direction) {
                    case RIGHT:
                        robot.turnRight();
                        break;
                    case UP:
                        break;
                    case LEFT:
                        robot.turnLeft();
                        break;
                    case DOWN:
                        robot.turnRight();
                        robot.turnRight();
                        break;

                }
                break;
            case LEFT:
                switch (direction) {
                    case RIGHT:
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    case UP:
                        robot.turnRight();
                        break;
                    case LEFT:
                        break;
                    case DOWN:
                        robot.turnLeft();
                        break;
                }
                break;
            case DOWN:
                switch (direction) {
                    case RIGHT:
                        robot.turnLeft();
                        break;
                    case UP:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                    case LEFT:
                        robot.turnRight();
                        break;
                    case DOWN:
                        break;
                }
        }
    }

    private static void robotRun(Robot robot, int delta, Direction direction) {
        povorot(robot, direction);
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
