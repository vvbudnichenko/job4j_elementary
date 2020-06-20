package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        ItemFive one = new ItemFive(1, "Alex");
        ItemFive two = new ItemFive(2, "Ivan");
        ItemFive three = new ItemFive(3, "Victor");
        tracker.add(one);
        tracker.add(two);
        tracker.add(three);
        ItemFive track = tracker.findById(1);
        System.out.println(track.getName());
        System.out.println();
        ItemFive[] array = new ItemFive[3];
        array[0] = one;
        array[1] = two;
        array[2] = three;
        for (ItemFive e : array) {
            System.out.println("Имя: " + e.getName() + "; номер в списке: " + e.getId());
        }
    }
}
