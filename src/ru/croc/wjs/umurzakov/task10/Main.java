package ru.croc.wjs.umurzakov.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> blacklist = new HashSet<>(Arrays.asList("дыня", "обман", "ява"));
        ArrayList<String> comments = new ArrayList<>(Arrays.asList("Хороший комментарий",
                "Эта дыня на фотографии больше, чем в жизни(( Недоволен",
                "Ваша методика -- обман!!",
                "@Анатолий я в айти большую часть своей жизни, сам занимаюсь автоматизацией тестирования на Ява"));

        System.out.println("Blacklist:");
        for (String badWord : blacklist) {
            System.out.print(badWord + " ");
        }

        System.out.println("\n\nКомментарии до использования фильтра:");
        for (String comment : comments) {
            System.out.println(comment);
        }

        BLFImplementation filter = new BLFImplementation();
        ArrayList<String> result = new ArrayList<>();
        result = filter.filterComments(comments, blacklist);
        System.out.println("\nКомментарии после использования фильтра:");
        for (String str : result) {
            System.out.println(str);
        }
    }
}
