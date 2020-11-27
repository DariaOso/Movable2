package ru.mirea.java.year2020.autumn.task6;

import ru.mirea.java.year2020.autumn.task5.Movable;
import ru.mirea.java.year2020.autumn.task5.MovablePoint;

public class MovableRectangle implements Movable {
    MovablePoint topPoint, bottomPoint;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topPoint = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomPoint = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topPoint.moveUp();
        bottomPoint.moveUp();
    }

    @Override
    public void moveDown() {
        topPoint.moveDown();
        bottomPoint.moveDown();
    }

    @Override
    public void moveLeft() {
        topPoint.moveLeft();
        bottomPoint.moveLeft();
    }

    @Override
    public void moveRight() {
        topPoint.moveRight();
        bottomPoint.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topPoint=" + topPoint +
                ", bottomPoint=" + bottomPoint +
                '}';
    }

    public boolean checkSpeed() {
        return (topPoint.getxSpeed() == bottomPoint.getySpeed() && topPoint.getxSpeed() == bottomPoint.getySpeed());
    }
}
