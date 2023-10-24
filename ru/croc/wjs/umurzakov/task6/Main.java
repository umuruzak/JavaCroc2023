package ru.croc.wjs.umurzakov.task6;

import ru.croc.wjs.umurzakov.task6.figures.Circle;
import ru.croc.wjs.umurzakov.task6.figures.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 1, 5, 5);
        Annotation bed = new Annotation("Bed", rectangle);
        Circle circle = new Circle(3,3, 3);
        Annotation face = new Annotation("Face", circle);

        AnnotatedImage image = new AnnotatedImage("./task6", new Annotation[]{bed, face});
        System.out.println(image.findByPoint(3, 2));
        System.out.println(image.findByLabel("ac"));

    }
}
