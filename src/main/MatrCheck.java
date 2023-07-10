package main;

import java.util.HashMap;
import java.util.Map;

public class MatrCheck {

    public boolean isValidMatr(char[][] board){

        for (char[] rowOfChar : board) {
            if (!isValidRow(rowOfChar)) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (!isValidColumn(board, i))
                return false;
        }

        return true;
    }

    public boolean isValidRow(char[] board){

        Map<Character, Integer> mapA = new HashMap<>();

        for (char c : board) {
            if(!isValidCell(c)) {
                return false;
            }

            if (c <= '9' && c >= '1') {
                mapA.merge(c, 1, Integer::sum);
            }
        }

        for (Map.Entry<Character, Integer> i: mapA.entrySet()){
            if (i.getValue() > 1) {
                return false;
            }
        }

        return true;
    }

    public boolean isValidColumn(char[][] board, int column){

        for (int i = 0; i < board.length; i++) {
            if(!isValidCell(board[i][column])) {
                return false;
            }

            if (board[i][column] <= '9' && board[i][column] >= '1') {
                return true;
            }
        }

        return false;
    }

    public boolean isValidCell(char c){

        if(c <= '9' && c >= '1') {
            return true;
        }

        return c == '.';
    }

}
