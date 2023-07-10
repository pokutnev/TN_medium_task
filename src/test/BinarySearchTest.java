package test;

import main.BinarySearch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @Test
    @DisplayName("test method for binary search of a number in an array with positive numbers")
    void searchElementInPositiveArr() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        var target = 8;
        var binarySearchObject = new BinarySearch();
        var searchResult= binarySearchObject.searchElement(array, target);

        assertEquals(7, searchResult);
    }

    @Test
    @DisplayName("test method for binary search of a number in an array with negative numbers")
    void searchElementInNegativeArr() {

        int[] array = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -13, -15, -18};

        var target = -7;
        var binarySearchObject = new BinarySearch();
        var searchResult = binarySearchObject.searchElement(array, target);

        assertEquals(6, searchResult);
    }

}