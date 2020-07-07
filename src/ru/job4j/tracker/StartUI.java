package ru.job4j.tracker;


public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item === ");
                String name = input.askStr("Enter name: ");
                ItemFive itemFive = new ItemFive(name);
                tracker.add(itemFive);
            } else if (select == 1) {
                System.out.println("=== Push to show all items === ");
                ItemFive[] array = tracker.findAll();
                for (int i = 0; i < array.length; i++) {
                    ItemFive result = array[i];
                    System.out.println("Item: " + result.getName() + ". Id number : " + result.getId());
                }
            } else if (select == 2) {
                System.out.println("=== To edit an item do pushing === ");
                String name = input.askStr("Enter name: ");
                ItemFive newItem = new ItemFive(name);
                int id = Integer.valueOf(input.askInt("ID"));
                if (tracker.replace(id, newItem)) {
                    System.out.println("Item replaced");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 3) {
                System.out.println("=== Delete items === ");
                int id = Integer.valueOf(input.askStr("Enter id: "));
                if (tracker.delete(id)) {
                    System.out.println("Item deleted");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 4) {
                System.out.println("=== Find ID === ");
                int id = Integer.valueOf(input.askInt("Enter id: "));
                ItemFive rsl = tracker.findById(id);
                if (rsl == null) {
                    System.out.println("Item: " + rsl.getName() + ". Id number : " + rsl.getId());
                } else {
                    System.out.println("Item not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find name === ");
                ItemFive[] name = tracker.findByName(input.askStr("Enter name: "));
                if (name == null) {
                    System.out.println("Item not found");
                    for (int i = 0; i < name.length; i++) {
                        ItemFive nextStep = name[i];
                        System.out.println("Item: " + nextStep.getName() + "; ID number: " + nextStep.getId());
                    }
                } else {
                        System.out.println("Item not found");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

        private void showMenu() {
            System.out.println("Menu. ");
            System.out.println("0. Add new Item ");
            System.out.println("1. Show all items. ");
            System.out.println("2. Edit item. ");
            System.out.println("3. Delete item. ");
            System.out.println("4. Find item by id. ");
            System.out.println("5. Find item by name. ");
            System.out.println("6. Exit Program. ");
        }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
