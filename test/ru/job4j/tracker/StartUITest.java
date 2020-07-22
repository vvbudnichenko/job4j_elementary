package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.core.IsNull.nullValue;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new ConsoleOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitItem(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new ConsoleOutput();
        Tracker tracker = new Tracker();
        ItemFive itemFive = tracker.add(new ItemFive("Replaced item"));
        String id = String.valueOf(itemFive.getId());
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", "New item name", id, "1"}
        );
        UserAction[] actions = {
                new ReplaceItemAction(out),
                new ExitItem(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new ConsoleOutput();
        Tracker tracker = new Tracker();
        ItemFive itemFive = tracker.add(new ItemFive("Deleted item"));
        String id = String.valueOf(itemFive.getId());
        Input in = new StubInput(
                new String[]{"0", id, "1"}
        );
        UserAction[] actions = {
                new DeleteItemAction(out),
                new ExitItem(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(itemFive.getId()), is(nullValue()));
    }

    @Test
    public void whenFindByNameAction() {
        Tracker tracker = new Tracker();
        Output out = new ConsoleOutput();
        ItemFive itemFive = tracker.add(new ItemFive("New item"));
        String name = itemFive.getName();
        Input in = new StubInput(
                new String[]{"0", name, "1"}
        );
        UserAction[] actions = {
                new FindByNameAction(out),
                new ExitItem(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(itemFive.getName(), is("New item"));
    }

    @Test
    public void whenFindByIdAction() {
        Tracker tracker = new Tracker();
        Output out = new ConsoleOutput();
        ItemFive itemFive = tracker.add(new ItemFive("New item"));
        String id = String.valueOf(itemFive.getId());
        Input in = new StubInput(
                new String[]{"0", id, "1"}
        );
        UserAction[] actions = {
                new FindByIdAction(out),
                new ExitItem(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(String.valueOf(itemFive.getId()), is(id));
    }

   @Test
    public void whenFindAllAction() {
        Tracker tracker = new Tracker();
        Output out = new ConsoleOutput();
        ItemFive itemFive = tracker.add(new ItemFive("Name"));
       ItemFive itemFive1 = tracker.add(new ItemFive("Name1"));
       ItemFive[] names = new  ItemFive[]{itemFive, itemFive1};
       Input in = new StubInput(
                new String[] {"0", "1"}
        );
        UserAction[] actions = {
                new FindAllAction(out),
                new ExitItem(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll(), is(names));
    }
}
