package ru.job4j.oop;

public class Battery {
    private  int load;

    public Battery(int power) {
        this.load = power;
    }
    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }
    public static void main(String[] args) {
        Battery powBank = new Battery(70);
        Battery cellPhone = new Battery(20);
        Battery samPad = new Battery(10);
        Battery another = new Battery(0);
        powBank.exchange(another);
        System.out.println(another.load);
        cellPhone.exchange(another);
        System.out.println(another.load);
        samPad.exchange(another);
        System.out.println(another.load);
        System.out.println(powBank.load);
        System.out.println(cellPhone.load);
        System.out.println(samPad.load);
    }
}
