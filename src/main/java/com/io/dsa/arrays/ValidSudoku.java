package com.io.dsa.arrays;

import java.util.HashSet;

public class ValidSudoku {

    public static boolean isRowValid(char[][] board, int row) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            if (set.contains(board[row][i])) {
                return false;
            }
            if (board[row][i] != '.') {
                set.add(board[row][i]);
            }
        }
        return true;
    }

    public static boolean isColValid(char[][] board, int col) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            if (set.contains(board[i][col])) {
                return false;
            }
            if (board[i][col] != '.') {
                set.add(board[i][col]);
            }
        }
        return true;
    }

    public static boolean isBoxValid(char[][] board, int row, int col) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char curr = board[i + row][j + col];
                if (set.contains(curr)) {
                    return false;
                }
                if (curr != '.') {
                    set.add(curr);
                }
            }
        }
        return true;
    }

    public static boolean isValid(char[][] board, int row, int col) {
        return isRowValid(board, row) && isColValid(board, col) && isBoxValid(board, row - row % 3, col - col % 3);
    }

    public static boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!isValid(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][] {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println((isValidSudoku(board) ? "YES" : "NO"));
    }
}
