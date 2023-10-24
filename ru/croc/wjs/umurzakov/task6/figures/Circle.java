package ru.croc.wjs.umurzakov.task6.figures;

public class Circle extends Figure {
    private int x0;
    private int y0;
    private int radius;

    public Circle(int x0, int y0, int radius) {
        this.x0 = x0;
        this.y0 = y0;
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус меньше нуля.");
        } else {
            this.radius = radius;
        }
    }

    public int getX0() {
        return x0;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public int getY0() {
        return y0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус меньше нуля.");
        } else {
            this.radius = radius;
        }
    }

    @Override
    public boolean hasPoint(int x, int y) {
        double distance = Math.sqrt((x0 - x) * (x0 - x) + (y0 - y) * (y0 - y));
        return (distance <= radius);
    }

    @Override
    public void move(int dx, int dy) {
        x0 += dx;
        y0 += dy;
    }

    @Override
    public String toString() {
        return "Circle (" + x0 + ", " + y0 + "), " + radius;
    }
}
