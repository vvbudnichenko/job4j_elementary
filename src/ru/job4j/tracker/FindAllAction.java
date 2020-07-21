package ru.job4j.tracker;

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
        ItemFive[] array = tracker.findAll();
        for (int i = 0; i < array.length; i++) {
            ItemFive result = array[i];
            System.out.println("Item: " + result.getName() + ". Id number : " + result.getId());
        } return true;
    }
}
