package ru.job4j.pojo;

public class Shop {

    public static void main(String[] args) {
        Product[] products = new Product[5];
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product != null) {
                System.out.println(product.getName());
            }
        }
    }

    public static int indexOfNull(Product[] products) {
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product == null) {
                return index;
            }
        }
        return -1;
    }
}
