package ru.job4j.tracker;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*public class Tracker {
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
        for (int i = 0; i < this.size; i++) {
            ItemFive itemFive = items[i];
            if (itemFive.getName().equals(key)) {
                result[size++] = items[i];
            }
        }
        return Arrays.copyOf(result, size);
    }

    public boolean replace(int id, ItemFive itemFive) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            items[index] = itemFive;
            itemFive.setId(id);
            rsl = true;
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
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
            int start = temp + 1;
            int size = this.size - temp;
            System.arraycopy(items, start, items, temp, size);
            items[this.size - 1] = null;
            this.size--;
        }
        return rsl;
    }
}*/

public class Tracker {
    private final List<ItemFive> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

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
        for (int index = 0; index < size; index++) {
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




