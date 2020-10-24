package ru.job4j.collection;

import java.util.HashMap;

/**
 * Класс UsageMap выводит значение данные пользователя с помощью HashMap;
 * @author Vladimir Budnichenko
 * @since 24.10.2020
 * @version 1
 */

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> user = new HashMap<>();
        user.put("budnichik@gmail.com", "Vladimir Vladimirovich Budnichenko");
        for(String key : user.keySet()) {
            String value = user.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
