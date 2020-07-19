package ru.job4j.tracker;

public class FindAllAction implements UserAction {

    @Override
    public String name() {
        return "=== Push to show all items === ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        ItemFive[] array = tracker.findAll();
        for (int i = 0; i < array.length; i++) {
            ItemFive result = array[i];
            System.out.println("Item: " + result.getName() + ". Id number : " + result.getId());
        } return true;
    }
}
