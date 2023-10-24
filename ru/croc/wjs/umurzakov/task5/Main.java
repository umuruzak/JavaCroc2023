package ru.croc.wjs.umurzakov.task5;

import ru.croc.wjs.umurzakov.task5.cleaner.RobotCleaner;
import ru.croc.wjs.umurzakov.task5.cleaner.VacuumCleaner;
import ru.croc.wjs.umurzakov.task5.cove.Cove;
import ru.croc.wjs.umurzakov.task5.cove.CoveType;
import ru.croc.wjs.umurzakov.task5.fridge.FreezerFridge;
import ru.croc.wjs.umurzakov.task5.fridge.Fridge;
import ru.croc.wjs.umurzakov.task5.fridge.MiniFridge;

public class Main {
    public static void main(String[] args) {
        //Холодильники
        MiniFridge miniFridge = new MiniFridge();
        miniFridge.setPrice(11_600);
        miniFridge.setDescription("Это мини-холодильник.");
        miniFridge.setCountry(Countries.CHINA);
        miniFridge.setWarranty(true);
        miniFridge.setLength(40);
        miniFridge.setWidth(40);
        miniFridge.setHeight(40);
        miniFridge.setWeight(12);
        miniFridge.setPower(3_000);

        Fridge fridge = new Fridge();
        fridge.setPrice(40_000);
        fridge.setDescription("Это просто холодильник и даже без камеры.");
        fridge.setCountry(Countries.JAPAN);
        fridge.setWarranty(false);
        fridge.setLength(70);
        fridge.setWidth(70);
        fridge.setHeight(170);
        fridge.setWeight(60);
        fridge.setPower(5_000);

        FreezerFridge freezer = new FreezerFridge();
        freezer.setPrice(35_000);
        freezer.setDescription("У этого есть камера.");
        freezer.setCountry(Countries.RUSSIA);
        freezer.setWarranty(true); //System.err.println();
        freezer.setLength(70);
        freezer.setWidth(65);
        freezer.setHeight(195);
        freezer.setWeight(80);
        freezer.setPower(5_500);
        freezer.setFreezerT(-7);

        //Пылесосы
        VacuumCleaner cleaner = new VacuumCleaner();
        cleaner.setPrice(7_000);
        cleaner.setDescription("Обычный пылесос.");
        cleaner.setCountry(Countries.KOREA);
        cleaner.setWarranty(false);
        cleaner.setLength(20);
        cleaner.setWidth(20);
        cleaner.setHeight(25);
        cleaner.setWeight(3);
        cleaner.setPower(1_000);
        cleaner.setVacuumCapacity(2.6);

        RobotCleaner robot = new RobotCleaner();
        robot.setPrice(10_000);
        robot.setDescription("Робот.");
        robot.setCountry(Countries.USA);
        robot.setWarranty(true);
        robot.setLength(15);
        robot.setWidth(15);
        robot.setHeight(15);
        robot.setWeight(20);
        robot.setPower(1_000);
        robot.setVacuumCapacity(0.5);
        robot.setBatteryCapacity(2_600);

        //Плита
        Cove cove = new Cove();
        cove.setPrice(40_000);
        cove.setType(CoveType.ELECTRIC);
        cove.setDescription("Электрическая плита.");
        cove.setCountry(Countries.RUSSIA);
        cove.setWarranty(true); //System.err.println();
        cove.setLength(50);
        cove.setWidth(40);
        cove.setHeight(195);
        cove.setWeight(80);
        cove.setPower(6_500);
        cove.setBurners(4);

        //Полиморфизм в действии
        Product[] products = new Product[6];
        products[0] = miniFridge;
        products[1] = fridge;
        products[2] = freezer;
        products[3] = cleaner;
        products[4] = robot;
        products[5] = cove;
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
