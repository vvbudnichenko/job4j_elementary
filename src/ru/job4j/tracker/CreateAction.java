package ru.job4j.tracker;

public class CreateAction implements UserAction {

    @Override
    public String name() {
        return " === Create a new Item === ";
    }
    @Override
    public boolean execute (Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        ItemFive itemFive = new ItemFive(name);
        tracker.add(itemFive);
        return true;
    }
}
