package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void whenSameAccount() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("007", "James Bond", "sdDgsForig3"),
                new Account("001", "Ivan Ivanov", "1743GfgW"),
                new Account("003", "Ivan Ivanov", "1743GfgW")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("007", "James Bond", "sdDgsForig3"),
                        new Account("001", "Ivan Ivanov", "1743GfgW"),
                        new Account("003", "Ivan Ivanov", "1743GfgW")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}