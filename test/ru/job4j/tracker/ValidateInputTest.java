package ru.job4j.tracker;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ValidateInputTest {

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        ValidateInput input = new ValidateInput(new StubInput(new String[]
                { "qwerty", "0" }
        ));
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitItem(out)
        };
        new StartUI(out).init(input, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                )
        ));
    }
}