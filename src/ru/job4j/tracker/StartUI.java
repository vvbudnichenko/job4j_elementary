package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item === ");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
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
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                ItemFive newItem = new ItemFive(name);
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.replace(id, newItem)) {
                    System.out.println("Item replaced");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 3) {
                System.out.println("=== Delete items === ");
                System.out.print("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Item deleted");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 4) {
                System.out.println("=== Find ID === ");
                System.out.print("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                ItemFive rsl = tracker.findById(id);
                    System.out.println("Item exists : " + rsl.getId());
            } else if (select == 5) {
                System.out.println("=== Find name === ");
                System.out.print("Enter name: ");
                ItemFive[] name = tracker.findByName(scanner.nextLine());
                for (ItemFive rsl : name) {
                    System.out.println("Hello " + rsl.getName());
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
