package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] postfix) {
        for (int i = word.length - 1; i >= 0; i--) {
            for (int j = postfix.length - 1; j >= 0; j--) {
                return word[i] == postfix[j];
            }
        }
        return true;
    }
}