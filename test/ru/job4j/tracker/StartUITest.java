package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.core.IsNull.nullValue;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ExitItem()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        ItemFive itemFive = tracker.add(new ItemFive("Replaced item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String id = String.valueOf(itemFive.getId());
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0","New item name", id, "1"}
        );
        UserAction[] actions = {
                new ReplaceItemAction(),
                new ExitItem()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        ItemFive itemFive = tracker.add(new ItemFive("Deleted item"));
        String id = String.valueOf(itemFive.getId());
        Input in = new StubInput(
                new String[] {"0", id, "1"}
        );
        UserAction[] actions = {
                new DeleteItemAction(),
                new ExitItem()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(itemFive.getId()), is(nullValue()));
    }
}