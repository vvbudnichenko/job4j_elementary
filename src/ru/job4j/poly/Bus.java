package ru.job4j.poly;

public class Bus implements Transport {
    private int passangers;
    private int gas;
    private int price;

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.fuel(5);
        bus.move();
        bus.passangers(20);
    }

    @Override
    public String move() {
        return null;
    }

    @Override
    public void passangers(int passangers) {
        this.passangers = passangers;
        System.out.println("Число пассажиров равно " + passangers);
    }

    @Override
    public int fuel(int gas) {
        int price = 50;
        this.gas = gas;
        System.out.println("Стоимость одной заправки: " + gas * price);
        return gas * price;
    }
}
