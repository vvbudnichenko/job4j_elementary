package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItemFive() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        ItemFive created = tracker.findAll()[0];
        ItemFive expected = new ItemFive("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        ItemFive itemFive = new ItemFive("new item");
        tracker.add(itemFive);
        tracker.findById(itemFive.getId());
        String[] answers = {"replaced item"};
        StartUI.replaceItem(new StubInput(answers), tracker);
        ItemFive replaced = tracker.findById(itemFive.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }
}