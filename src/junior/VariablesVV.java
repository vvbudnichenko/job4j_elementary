import javax.swing.*;

public class VariablesVV {
    public static void main(String[] args) {


        boolean bool = true; // faalse
        byte b = 10;
        char c = 'g';
        double d = 350056401.75;
        float f = 5.7f;
        int i = 299999999;
        long n = 123456789;
        short s = 2000;
        String str = "My string";

        String result = "";
        result += "Boolean bool = " + bool + "\n";
        result += "byte b = " + b + "\n";
        result += "char c = " + c + "\n";
        result += "double d = " + d + "\n";
        result += "float f = " + f + "\n";
        result += "int i = " + i + "\n";
        result += "Long n = " + n + "\n";
        result += "short s = " + s + "\n";
        result += "String str = " + str + "\n";

        System.out.println(result);
        String str_n =  "53";
        int summa = Integer.parseInt(str_n) +20;
        System.out.println(summa);
    }
}
