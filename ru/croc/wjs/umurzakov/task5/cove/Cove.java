package ru.croc.wjs.umurzakov.task5.cove;

import ru.croc.wjs.umurzakov.task5.Product;

/*
Я посчитал, что газовая и электроплиты недостаточно отличаются (у них были бы просто одинаковые поля),
чтобы разносить их по отдельным классам, поэтому у меня это один класс
с полем типа.
 */
public class Cove extends Product {
    private int burners; //Кол-во конфорок
    private CoveType type;

    public Cove() {
    }

    public int getBurners() {
        return burners;
    }

    public void setBurners(int burners) {
        if (burners <= 0) {
            System.err.println("Недопустимое количество конфорок.");
        } else {
            this.burners = burners;
        }
    }

    public CoveType getType() {
        return type;
    }

    public void setType(CoveType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String tmpStr = "";
        if (type == CoveType.GAS) {
            tmpStr = "Газовая плита. ";
        } else if (type == CoveType.ELECTRIC) {
            tmpStr = "Электрическая плита. ";
        }
        return tmpStr + super.toString() + "Количество конфорок: " + burners + "\n";
    }
}
