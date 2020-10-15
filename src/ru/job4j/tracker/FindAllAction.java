package ru.job4j.tracker;

import java.util.List;

public class FindAllAction implements UserAction {
    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Push to show all items === ");
        for (ItemFive itemFive : tracker.findAll()) {
            System.out.println("ID: " + itemFive.getId() + ".  Item name: " + itemFive.getName());
        } return true;
    }
}
