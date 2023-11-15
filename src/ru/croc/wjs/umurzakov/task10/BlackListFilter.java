package ru.croc.wjs.umurzakov.task10;

import java.util.ArrayList;
import java.util.Set;

public interface BlackListFilter<T> {
    T[] extractWordsFromComment(T comment);

    T checkAndChangeComment(T comment, T word, Set<T> blackList);

    default ArrayList<T> filterComments(Iterable<T> comments, Set<T> blackList) {
        ArrayList<T> result = new ArrayList<>();
        for (T comment : comments) {
            T[] words = extractWordsFromComment(comment);
            T commentToAdd = comment;
            for (T word : words) {
                commentToAdd = checkAndChangeComment(commentToAdd, word, blackList);
            }
            result.add(commentToAdd);
        }
        return result;
    }
}
