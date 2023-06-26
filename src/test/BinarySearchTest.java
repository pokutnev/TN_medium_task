package test;

import main.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void searchElementTest() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        int target1 = 8;
        int target2 = 17;
        int target3 = 4;

        int result1 = BinarySearch.searchElement(array, target1);
        int result2 = BinarySearch.searchElement(array, target2);
        int result3 = BinarySearch.searchElement(array, target3);

        Assertions.assertEquals(7, result1);
        Assertions.assertEquals(-1, result2);
        Assertions.assertEquals(3, result3);

    }
}