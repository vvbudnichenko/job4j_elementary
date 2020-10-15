package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find name === ");
        String name = input.askStr("Enter name: ");
        List<ItemFive> items = tracker.findByName(name);
        if (items.size() > 0) {
            for (ItemFive i : tracker.findByName(name)) {
                System.out.println("Item: " + i.getName() + "; ID number: " + i.getId());
            }
        } else if (items.size() <= 0) {
            System.out.println("Item not found");
        } return true;
    }
}
