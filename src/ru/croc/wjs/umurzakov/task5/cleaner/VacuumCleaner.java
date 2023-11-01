package ru.croc.wjs.umurzakov.task5.cleaner;

import ru.croc.wjs.umurzakov.task5.Product;

public class VacuumCleaner extends Product {
    private double vacuumCapacity; //объем пылесборника

    public double getVacuumCapacity() {
        return vacuumCapacity;
    }

    public void setVacuumCapacity(double capacity) {
        if (capacity <= 0) {
            System.err.println("Недопустимый объем пылесборника.");
        } else {
            vacuumCapacity = capacity;
        }
    }


    @Override
    public String toString() {
        return "Пылесос. " + super.toString() + "Объем пылесборника: " + vacuumCapacity + " л\n";
    }
}
