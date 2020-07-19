package ru.job4j.tracker;

public class DeleteItemAction implements UserAction {

    @Override
    public String name() {
        return "=== Delete items === ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item deleted");
        } else {
            System.out.println("Error");
        } return true;
    }
}
