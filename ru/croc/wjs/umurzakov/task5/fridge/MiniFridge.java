package ru.croc.wjs.umurzakov.task5.fridge;

import ru.croc.wjs.umurzakov.task5.Product;

public class MiniFridge extends Product {

    public MiniFridge() {
    }

    @Override
    public void setLength(double length) {
        if (length < 60) {
            super.setLength(length);
        } else {
            System.err.println("Не соответствует длине мини-холодильника.");
        }
    }

    @Override
    public void setWidth(double width) {
        if (width < 60) {
            super.setWidth(width);
        } else {
            System.err.println("Не соответствует ширине мини-холодильника.");
        }
    }

    @Override
    public void setHeight(double height) {
        if (height < 100) {
            super.setHeight(height);
        } else {
            System.err.println("Не соответствует высоте мини-холодильника.");
        }
    }

    @Override
    public void setWeight(double weight) {
        if (weight < 15) {
            super.setWeight(weight);
        } else {
            System.err.println("Не соответствует весу мини-холодильника.");
        }
    }

    @Override
    public String toString() {
        return "Мини-холодильник. " + super.toString();
    }

}
