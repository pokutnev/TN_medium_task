package test;

import main.DuplicateElements;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateElementsTest {

    @Test
    @DisplayName("test method for finding duplicate elements and getting a list with duplicates")
    void getDuplicatesReturnListWithDuplicates() {

        List<Integer> sequenceOfElements = new ArrayList<>();

        sequenceOfElements.add(1);
        sequenceOfElements.add(12);
        sequenceOfElements.add(4);
        sequenceOfElements.add(3);
        sequenceOfElements.add(8);
        sequenceOfElements.add(1);
        sequenceOfElements.add(3);
        sequenceOfElements.add(4);
        sequenceOfElements.add(3);

        List<Integer> expectedResult = List.of(1, 3, 4);
        var duplicateElementsObject = new DuplicateElements();
        List<Integer> resultList = duplicateElementsObject.getDuplicates(sequenceOfElements);

        assertEquals(expectedResult, resultList);
    }

    @Test
    @DisplayName("test method for finding duplicate elements and getting empty list")
    void getDuplicatesReturnListWithoutDuplicates() {

        List<Integer> sequenceOfElements = new ArrayList<>();

        sequenceOfElements.add(1);
        sequenceOfElements.add(2);
        sequenceOfElements.add(3);
        sequenceOfElements.add(4);
        sequenceOfElements.add(5);
        sequenceOfElements.add(6);
        sequenceOfElements.add(7);

        List<Integer> expectedResult = List.of();
        var duplicateElementsObject = new DuplicateElements();
        List<Integer> resultList = duplicateElementsObject.getDuplicates(sequenceOfElements);

        assertEquals(expectedResult, resultList);
    }

}