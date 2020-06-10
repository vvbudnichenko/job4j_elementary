package ru.job4j.pojo;

import junior.Products;
import org.junit.Assert;

public class Shop {
    /*public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);

        Product[] prods = new Product[5];
        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;
        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        prods[1] = null;
        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        prods[1] = prods[2];
        prods[2] = null;
        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
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
        Product[] pr = delete(prody, entery);
        Assert.assertArrayEquals(pr, expceted);
    }*/
    public static Product[] delete(Product[] products, int index) {
        for (index = 0; index < products.length - 1; index++) {
            for (int i = index; i < products.length - 1; i++) {
                if (products[i] == null) {
                    Product temp = products[i + 1];
                    products[i + 1] = products[i];
                    products[i] = temp;
                }
            } products[products.length - 1] = null;
            Product pr = products[index];
            if (pr != null) {
                System.out.println(pr.getName() + " " + pr.getCount());
            } else {
                    System.out.println("null");
            }
        } System.out.println();
        return products;
    }
}