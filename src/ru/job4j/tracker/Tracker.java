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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public ItemFive[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public ItemFive[] findByName(String key) {
        ItemFive[] result = new ItemFive[size];
        int size = 0;
        for (int i = 0; i <= this.size; i++) {
            ItemFive itemFive = items[i];
            if (itemFive.equals(key)) {
                result[size] = itemFive;
                size++;
        }
        result = Arrays.copyOf(result, size);
        }
        return result;
    }
   /* public boolean replace(int id, ItemFive itemFive) {
        int index = indexOf(id);
        itemFive.setId(id);
        items[index] = itemFive;
    }*/
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
            }
        } return rsl;
    }
}


