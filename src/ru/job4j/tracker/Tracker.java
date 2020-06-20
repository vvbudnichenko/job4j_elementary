package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final ItemFive[] items = new ItemFive[100];
    private int ids = 1;
    private int size = 0;

    public ItemFive add(ItemFive itemFive) {
        itemFive.setId(ids++);
        items[size++] = itemFive;
        return itemFive;
    }

    public ItemFive findById(int id) {
        ItemFive rsl = null;
        for (int index = 0; index < size; index++) {
            ItemFive itemFive = items[index];
            if (itemFive.getId() == id) {
                rsl = itemFive;
                break;
            }
        }
        return rsl;
    }

    public ItemFive[] findAll(ItemFive[] listOfRequests) {
        int size = 0;
        ItemFive[] resulty = new ItemFive[size];
        for (int i = 0; i < listOfRequests.length; i++) {
            ItemFive listy = listOfRequests[i];
            if (listy != null) {
                resulty[size] = listy;
                size++;
            }
        }
        resulty = Arrays.copyOf(resulty, size);
        for (int index = 0; index < resulty.length; index++) {
            System.out.println(resulty[index]);
        }
        return resulty;
    }

    public ItemFive[] findByName(String key) {
        int size = 0;
        ItemFive[] result = new ItemFive[size];
        for (int i = 0; i <= size; i++) {
            ItemFive itemFive = items[i];
            if (itemFive != null) {
                result[size] = itemFive;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
        return result;
    }
}


