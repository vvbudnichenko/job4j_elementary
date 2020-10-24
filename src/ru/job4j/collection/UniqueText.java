package ru.job4j.collection;

import java.util.HashSet;

/**
 /* Класс UniqueText проверяет уникальность теста
 * @author Vladimir Budnichenko
 * @since 24.10.2020
 * @version 2
 */

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
            for (String orig : origin) {
                check.add(orig);
            }
                for (String dupl : text) {
                    rsl = check.contains(dupl);
                    if (!rsl) {
                        break;
                    }
        } return rsl;
    }
}
