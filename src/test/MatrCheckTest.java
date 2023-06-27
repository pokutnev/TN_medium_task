package test;


import main.MatrCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MatrCheckTest {

    @Test
    void isValidMatr() {

        char[][] board ={{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}
        };

        boolean expectedResult = true;

        MatrCheck object = new MatrCheck();
        boolean result = object.isValidMatr(board);

        Assertions.assertEquals(expectedResult, result);

    }
}