package robots;

public class TestRobots {

    class Napravlenie {
        private Direction x,y;
        public Napravlenie(Direction x, Direction y) {
            this.x = x;
            this.y = y;
        }
        public Direction getX() {
            return x;
        }
        public Direction getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Napravlenie{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public  Napravlenie  getNapravlenie(int x, int y, int toX, int toY) {
        return new Napravlenie(toX > x ? Direction.RIGHT : Direction.LEFT ,toY>y ? Direction.UP : Direction.DOWN );
    }
    Robot Povorot (Robot robot, Direction direction){
        //повернуть робота в нужном направлении
        Direction directionRobot = robot.direction;
        if(direction==directionRobot) {
            return robot;
        }
        switch (directionRobot){
            case RIGHT:
                switch (direction) {
                    case UP: robot.turnLeft(); break;
                    case LEFT: robot.turnRight();
                    case DOWN: robot.turnRight();
                } break;
            case UP:
                switch (direction) {
                    case LEFT: robot.turnLeft(); break;
                    case DOWN: robot.turnRight();
                    case RIGHT: robot.turnRight();
                } break;
            case LEFT:
                switch (direction) {
                case UP: robot.turnRight();  break;
                case RIGHT: robot.turnLeft();
                case DOWN:  robot.turnLeft();
            }
            break;
            case DOWN:
                switch (direction) {
                    case RIGHT: robot.turnLeft(); break;
                    case UP: robot.turnRight();
                    case LEFT: robot.turnRight();
                }
        }
        return robot;
    }
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        Direction direction = robot.direction;

        int deltaX = Math.abs(toX-x); // растояние которое нужно пройти по X
        int deltaY = Math.abs(toY-y); // растояние которое нужно пройти по Y

        Napravlenie napravlenie = getNapravlenie(x,y,toX,toY);
        System.out.println(toX + " " + toY);
        System.out.println(napravlenie + " " + deltaX +" "+ deltaY);
        //
       if (!(deltaX==0&&deltaY==0)) {
           if (deltaX == 0) {
               robot = Povorot(robot, napravlenie.getY());
               for (int i = 0; i < deltaY; i++)
                   robot.stepForward();
           } else
           if (deltaY == 0) {
               robot = Povorot(robot, napravlenie.getX());
               for (int j = 0; j < deltaX; j++)
                   robot.stepForward();
           } else {
               robot = Povorot(robot, napravlenie.getY());
               for (int i = 0; i < deltaY; i++)
                   robot.stepForward();

               robot = Povorot(robot, napravlenie.getX());
               for (int j = 0; j < deltaX; j++)
                   robot.stepForward();
           }
       }
        System.out.println(robot.getX() +" " + robot.getY()+ "  " + robot.getDirection().toString());
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        TestRobots testRobots = new TestRobots();
        testRobots.moveRobot(robot,4,6);
        testRobots.moveRobot(robot,5,9);
        testRobots.moveRobot(robot,2,6);

    }


}
