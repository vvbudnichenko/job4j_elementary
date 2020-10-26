package ru.job4j.collection;

import java.util.HashMap;
import  java.util.List;

/**
 * Класс данных, который конвертирует пользовательнские заявки List в Map
 * @author Vladimir Budnichenko
 * @version 1
 */

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order temp : orders) {
            map.put(temp.getNumber(), temp);
        } return map;
    }
}
