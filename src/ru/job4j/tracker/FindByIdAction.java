package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by ID ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find ID === ");
        int id = input.askInt("Enter id: ");
        ItemFive rsl = tracker.findById(id);
        if (rsl != null) {
            System.out.println("Item: " + rsl.getName() + ". Id number : " + rsl.getId());
        } else if (rsl == null) {
            System.out.println("Item not found");
        } return true;
    }
}
