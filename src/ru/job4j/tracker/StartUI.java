package ru.job4j.tracker;


public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item === ");
        String name = input.askStr("Enter name: ");
        ItemFive itemFive = new ItemFive(name);
        tracker.add(itemFive);
    }
    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== To edit an item do pushing === ");
        String name = input.askStr("Enter name: ");
        ItemFive newItem = new ItemFive(name);
        int id = input.askInt("ID: ");
        if (tracker.replace(id, newItem)) {
            System.out.println("Item replaced");
        } else {
            System.out.println("Error");
        }
    }
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete items === ");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item deleted");
        } else {
            System.out.println("Error");
        }
    }
        public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                System.out.println("=== Push to show all items === ");
                ItemFive[] array = tracker.findAll();
                for (int i = 0; i < array.length; i++) {
                    ItemFive result = array[i];
                    System.out.println("Item: " + result.getName() + ". Id number : " + result.getId());
                }
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                System.out.println("=== Find ID === ");
                int id = input.askInt("Enter id: ");
                ItemFive rsl = tracker.findById(id);
                if (rsl != null) {
                    System.out.println("Item: " + rsl.getName() + ". Id number : " + rsl.getId());
                } else if (rsl == null) {
                    System.out.println("Item not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find name === ");
                ItemFive[] name = tracker.findByName(input.askStr("Enter name: "));
                if (name.length > 0) {
                    for (int i = 0; i < name.length; i++) {
                        ItemFive nextStep = name[i];
                        System.out.println("Item: " + nextStep.getName() + "; ID number: " + nextStep.getId());
                    }
                } else if (name.length <= 0) {
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
