package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true; // проверить. что массив word имеет последние элементы одинаковые с post
        int index = post.length;
        int p = word.length;
        for (int i = word.length - 1; i < post[0]; i--) {
            int temp =  p - i - 1;
                if (word[i] != post[index - 1 - temp]) {
                    result = false;
            }
        }
        return result;
    }
}