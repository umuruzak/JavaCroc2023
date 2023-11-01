package ru.croc.wjs.umurzakov.task5.cleaner;

public class RobotCleaner extends VacuumCleaner {
    private int batteryCapacity;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int capacity) {
        if (capacity <= 0) {
            System.err.println("Недопустимая емкость батареи.");
        } else {
            batteryCapacity = capacity;
        }
    }

    @Override
    public String toString() {
        return "Робот-п" + super.toString().substring(1) + "Емкость батареи: " + batteryCapacity + " мА*ч\n";
    }
}
