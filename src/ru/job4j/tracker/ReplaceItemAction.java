package ru.job4j.tracker;

public class ReplaceItemAction implements UserAction {

    @Override
    public String name() {
        return "=== To edit an item do pushing === ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        ItemFive newItem = new ItemFive(name);
        int id = input.askInt("ID: ");
        if (tracker.replace(id, newItem)) {
            System.out.println("Item replaced");
        } else {
            System.out.println("Error");
        } return true;
    }
}
