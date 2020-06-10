package ru.job4j.pojo;

import org.junit.Test;
import org.junit.Assert;

public class ShopTest {

    @Test
    public void whenItThenONe() {
        Product cola = new Product("Cola", 10);
        Product vesi = new Product("Vesi", 4);
        Product kvas = new Product("Kvas", 19);

        int entery = 5;
        Product[] prody = new Product[entery];
        prody[0] = cola;
        prody[2] = kvas;
        prody[3] = vesi;
        Product[] expceted = new Product[entery];
        expceted[0] = cola;
        expceted[1] = kvas;
        expceted[2] = vesi;
        Product[] pr = Shop.delete(prody, entery);
        Assert.assertArrayEquals(pr, expceted);
    }
    @Test
    public void whenItThenThree() {
        Product cola = new Product("Cola", 10);
        Product vesi = new Product("Vesi", 4);
        Product kvas = new Product("Kvas", 19);

        int entery = 5;
        Product[] prody = new Product[entery];
        prody[0] = cola;
        prody[3] = kvas;
        prody[4] = vesi;
        Product[] expceted = new Product[entery];
        expceted[0] = cola;
        expceted[1] = kvas;
        expceted[2] = vesi;
        expceted[3] = null;
        expceted[4] = null;
        Product[] pr = Shop.delete(prody, entery);
        Assert.assertArrayEquals(pr, expceted);
    }
}