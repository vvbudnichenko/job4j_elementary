package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] postfix) {
        for (int i = 0; i < postfix.length; i++) {
            if (postfix[postfix.length - i - 1] != word[word.length - i - 1]) {
                return false;
            }
    }
        return true;
    }
}