package robots;

import static robots.Direction.*;

public class Robot {
    private int x, y;
    private Direction direction = Direction.UP;

    public Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        System.out.println("Поворот против часовой стрелки");
        switch (direction) {
            case DOWN:
                direction = RIGHT;
                break;
            case UP:
                direction = LEFT;
                break;
            case LEFT:
                direction = DOWN;
                break;
            case RIGHT:
                direction = UP;
                break;
        }
    }

    public void turnRight() {
        System.out.println("Поворот по часовой стрелке");
        switch (direction) {
            case DOWN:
                direction = Direction.LEFT;
                break;
            case UP:
                direction = Direction.RIGHT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
            case RIGHT:
                direction = DOWN;
                break;
        }
    }

    public void stepForward() {
        switch (direction) {
            case DOWN:
                System.out.println("вниз");
                y--;
                break;
            case UP:
                System.out.println("вверх");
                y++;
                break;
            case LEFT:
                System.out.println("налево");
                x--;
                break;
            case RIGHT:
                System.out.println("направо");
                x++;
                break;
        }
    }
}
