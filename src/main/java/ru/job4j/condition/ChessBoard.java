package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (isValid(x1) && isValid(y1) && isValid(x2) && isValid(y2)) {
            if (isSameDifference(x1, x2, y1, y2)) {
                result = Math.abs(x2 - x1);
            }
        }
        return result;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    private static boolean isSameDifference(int x1, int x2, int y1, int y2) {
        return Math.abs(x1 - x2) == Math.abs(y1 - y2);
    }
}