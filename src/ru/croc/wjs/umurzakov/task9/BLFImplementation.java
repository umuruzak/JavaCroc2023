package ru.croc.wjs.umurzakov.task9;

import java.util.List;
import java.util.Set;

public class BLFImplementation implements BlackLIstFilter {
    @Override
    public void filterComments(List<String> comments, Set<String> blackList) {
        for (int i = 0; i < comments.size(); i++) {
            String comment = comments.get(i);
            String[] words = comment.split("[ ,;.:!?()\\s]+"); // разбиваем на слова
            for (String word : words) {
                if (blackList.contains(word.toLowerCase())) { // подразумевается, что и в blacklist'е слова приведены в
                    comment = comment.replace(word, ""); // нижнем регистре)
                }
            }
            comments.set(i, comment);
        }
    }
}
