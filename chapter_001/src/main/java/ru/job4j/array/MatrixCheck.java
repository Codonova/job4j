package ru.job4j.array;

/**
 * MatrixCheck
 * @author Ruslan Kooslapchenkov
 */

public class MatrixCheck {
    /**
     * Проверяет заполнена ли горизонталь одинаковыми символами
     * @param board входящий многомерный массив (доска)
     * @param row линия доски
     * @return result true or false
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Проверяет заполнена ли вертикаль одинаковыми символами
     * @param board входящий многомерный массив (доска)
     * @param column вертикаль доски
     * @return result true or false
     */

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Проверяет заполнена ли диагональ одинаковыми символами
     * @param board входящий многомерный массив (доска)
     * @return rsl многомерный массив
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Проверяет выигрышную комбинацию
     * @param board входящий многомерный массив (доска)
     * @return result true or false
     */

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (monoHorizontal(board, i) || monoVertical(board, i)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
