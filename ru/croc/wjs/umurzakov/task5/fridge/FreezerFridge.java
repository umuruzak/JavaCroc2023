package ru.croc.wjs.umurzakov.task5.fridge;

public class FreezerFridge extends Fridge {
    private double freezerT;

    public FreezerFridge() {
    }

    public double getFreezerT() {
        return freezerT;
    }

    public void setFreezerT(double freezerT) {
        this.freezerT = freezerT;
    }

    @Override
    public String toString() {
        return super.toString() + "Температура морозильной камеры: " + freezerT + "\n";
    }
}
