package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<ItemFive> items = new ArrayList<>();
    private int ids = 1;

    public ItemFive add(ItemFive itemFive) {
        itemFive.setId(ids++);
        items.add(itemFive);
        return itemFive;
    }

    public ItemFive findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<ItemFive> findAll() {
        return items;
    }

    public List<ItemFive> findByName(String key) {
        List<ItemFive> result = new ArrayList<>();
        for (int index = 0; index < items.size(); index++) {
            ItemFive itemFive = items.get(index);
            if (itemFive.getName().equals(key)) {
                result.add(this.items.get(index));
            }
        }
        return result;
    }

    public boolean replace(int id, ItemFive itemFive) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            items.set(index, itemFive);
            itemFive.setId(id);
            rsl = true;
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        int temp = indexOf(id);
        boolean rsl = temp != -1;
        if (rsl) {
            items.remove(temp);
        }
        return rsl;
    }
}




