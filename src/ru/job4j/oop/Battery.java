package ru.job4j.oop;

public class Battery {
    private  int load;

    public Battery(int power) {
        this.load = power;
    }
    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }
    public static void main(String[] args) {
        Battery powBank = new Battery(70);
        Battery cellPhone = new Battery(20);
        Battery samPad = new Battery(10);
        Battery another = new Battery(0);
        another.exchange(powBank);
        System.out.println(another.load);
        another.exchange(cellPhone);
        System.out.println(another.load);
        another.exchange(samPad);
        System.out.println(another.load);
    }
}
