package ru.croc.wjs.umurzakov.task9;

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
        BLFImplementation filter = new BLFImplementation();
        filter.filterComments(comments, blacklist);
        for (String str : comments) {
            System.out.println(str);
        }
    }
}
