package ru.croc.wjs.umurzakov.task6.figures;

public class Rectangle extends Figure {
    private int xLeft;
    private int yLeft;
    private int xRight;
    private int yRight;

    public Rectangle(int xLeft, int yLeft, int xRight, int yRight) {
        if (xRight <= xLeft) {
            throw new IllegalArgumentException("Недопустимые абсциссы вершин прямоугольника.");
        } else if (yRight <= yLeft) {
            throw new IllegalArgumentException("Недопустимые ординаты вершин прямоугольника.");
        } else {
            this.xLeft = xLeft;
            this.yLeft = yLeft;
            this.xRight = xRight;
            this.yRight = yRight;
        }
    }

    public int getxLeft() {
        return xLeft;
    }

    public void setxLeft(int xLeft) {
        if (xLeft >= xRight) {
            throw new IllegalArgumentException("Недопустимая абсцисса левого нижнего угла.");
        } else {
            this.xLeft = xLeft;
        }
    }

    public int getyLeft() {
        return yLeft;
    }

    public void setyLeft(int yLeft) {
        if (yLeft >= yRight) {
            throw new IllegalArgumentException("Недопустимая ордината левого нижнего угла.");
        } else {
            this.yLeft = yLeft;
        }
    }

    public int getxRight() {
        return xRight;
    }

    public void setxRight(int xRight) {
        if (xRight <= xLeft) {
            throw new IllegalArgumentException("Недопустимая абсцисса правого верхнего угла.");
        } else {
            this.xRight = xRight;
        }
    }

    public int getyRight() {
        return yRight;
    }

    public void setyRight(int yRight) {
        if (yRight <= yLeft) {
            throw new IllegalArgumentException("Недопустимая ордината правого верхнего угла.");
        } else {
            this.yRight = yRight;
        }
    }

    @Override
    public boolean hasPoint(int x, int y) {
        return ((xLeft <= x) && (x <= xRight) && (yLeft <= y) && (y <= yRight));
    }

    @Override
    public void move(int dx, int dy) {
        xLeft += dx;
        xRight += dx;
        yLeft += dy;
        yRight += dy;
    }

    @Override
    public String toString() {
        return "Rectangle (" + xLeft + ", " + yLeft + "), " + "( " + xRight + ", " + yRight + ")";
    }
}
