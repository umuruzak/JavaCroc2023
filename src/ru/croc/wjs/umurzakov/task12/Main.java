package ru.croc.wjs.umurzakov.task12;

import static ru.croc.wjs.umurzakov.task12.TernaryOperator.ternaryOperator;

public class Main {
    public static void main(String[] args) {
        int number = 7;
        String example1 = ternaryOperator(str -> number % 2 == 0, () -> "Четное", () -> "Нечетное");
        System.out.println(example1);

        String text = "Челеста.";
        String example2 = ternaryOperator(str -> text != null && text.length() > 0, () -> "Строка не пуста", () -> "Строка пуста");
        System.out.println(example2);
    }
}
