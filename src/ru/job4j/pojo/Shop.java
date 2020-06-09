package ru.job4j.pojo;

import org.junit.Assert;


public class Shop {
    public static void main(String[] args) {
       /* Product milk = new Product("Milk", 10);
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
        System.out.println();*/
        Product cola = new Product("Cola", 10);
        Product vesi = new Product("Vesi", 4);
        Product kvas = new Product("Kvas", 19);

        int entery = 5;
        Product[] prody = new Product[entery];
        prody[2] = cola;
        prody[3] = vesi;
        prody[4] = kvas;
        Product[] expceted = new Product[entery];
        expceted[0] = cola;
        expceted[1] = vesi;
        expceted[2] = kvas;
        expceted[3] = null;
        expceted[4] = null;
        Product[] pr = delete(prody, entery);
        Assert.assertArrayEquals(pr, expceted);
    }

    public static Product[] delete(Product[] products, int index) {
        for (index = 0; index < products.length - 1; index++) {
            Product pr = products[index];
            if (pr == null) {
                products[index] = products[index + 1];
                products[index + 1] = null;
                if (pr != null) {
                    System.out.println(pr.getName() + " - " + pr.getCount());
                } else {
                    System.out.println("null");
                }
            }
        }
            return products;
        }
    }