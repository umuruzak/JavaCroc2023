package ru.croc.wjs.umurzakov.task10;

import java.util.Set;

public class BLFImplementation implements BlackListFilter<String> {
    @Override
    public String[] extractWordsFromComment(String comment) {
        return comment.split("[ ,;.:!?()\\s]+");
    }

    @Override
    public String checkAndChangeComment(String comment, String word, Set<String> blackList) {
        if (blackList.contains(word.toLowerCase())) {
            comment = comment.replace(word, "");
        }
        return comment;
    }
}
