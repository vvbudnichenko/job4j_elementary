package ru.job4j.tracker;

public class ReplaceItemAction implements UserAction {
    private final Output out;

    public ReplaceItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Replacing";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== To edit an item do pushing === ");
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
