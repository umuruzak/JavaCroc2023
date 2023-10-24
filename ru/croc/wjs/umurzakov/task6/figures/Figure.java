package ru.croc.wjs.umurzakov.task6.figures;

public abstract class Figure implements Movable{
    public Figure() {
    }

    public abstract boolean hasPoint(int x, int y);

    @Override
    public void move(int dx, int dy) {
    }
}
