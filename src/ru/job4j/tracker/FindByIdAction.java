package ru.job4j.tracker;

public class FindByIdAction implements UserAction {

    @Override
    public String name() {
        return "=== Find ID === ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        ItemFive rsl = tracker.findById(id);
        if (rsl != null) {
            System.out.println("Item: " + rsl.getName() + ". Id number : " + rsl.getId());
        } else if (rsl == null) {
            System.out.println("Item not found");
        } return true;
    }
}
