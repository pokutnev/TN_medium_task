package test;

import main.MatrCheck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrCheckTest {

    @Test
    @DisplayName("test method validity check and getting result true")
    void isValidMatrReturnTrue() {

        char[][] board =
                {{'5','3','.','.','7','.','.','.','.'}
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
        var matrCheckObject = new MatrCheck();
        boolean isMatrValid = matrCheckObject.isValidMatr(board);

        assertEquals(expectedResult, isMatrValid);
    }

    @Test
    @DisplayName("test method validity check and getting result false")
    void isValidMatrReturnFalse() {

        char[][] board =
                {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','.','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}
        };

        boolean expectedResult = false;
        var matrCheckObject = new MatrCheck();
        boolean isMatrValid = matrCheckObject.isValidMatr(board);

        assertEquals(expectedResult, isMatrValid);
    }
}