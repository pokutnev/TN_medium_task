package main;

import java.util.HashMap;
import java.util.HashSet;
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
        var setOfChars = new HashSet<Character>();

        for (char c: board) {
            if(!isValidCell(c)) {
                return false;
            }

            if (c == '.' || c <= '9' && c >= '1' && !setOfChars.contains(c)) {
                setOfChars.add(c);
            }
            else {
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
