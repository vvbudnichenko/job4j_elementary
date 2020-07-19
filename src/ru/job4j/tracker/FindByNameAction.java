package ru.job4j.tracker;

public class FindByNameAction implements UserAction {

    @Override
    public String name() {
        return "=== Find name === ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        ItemFive[] name = tracker.findByName(input.askStr("Enter name: "));
        if (name.length > 0) {
            for (int i = 0; i < name.length; i++) {
                ItemFive nextStep = name[i];
                System.out.println("Item: " + nextStep.getName() + "; ID number: " + nextStep.getId());
            }
        } else if (name.length <= 0) {
            System.out.println("Item not found");
        } return true;
    }
}
