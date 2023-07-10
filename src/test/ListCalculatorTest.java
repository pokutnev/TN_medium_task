package test;

import main.ListCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ListCalculatorTest {

    @Test
    @DisplayName("test method getting sum of positive numbers")
    void getPositiveSum() {

        List<Integer> sequenceOfElements = new ArrayList<>();

        sequenceOfElements.add(5);
        sequenceOfElements.add(5);
        sequenceOfElements.add(-2);
        sequenceOfElements.add(4);
        sequenceOfElements.add(-8);
        sequenceOfElements.add(-1);

        int expectedResult = 14;
        var calculatorObject = new ListCalculator();
        int positiveSum = calculatorObject.getPositiveSum(sequenceOfElements);

        assertEquals(expectedResult, positiveSum);
    }

    @Test
    @DisplayName("test method getting sum of negative numbers")
    void getNegativeSum() {

        List<Integer> sequenceOfElements = new ArrayList<>();

        sequenceOfElements.add(5);
        sequenceOfElements.add(5);
        sequenceOfElements.add(-2);
        sequenceOfElements.add(4);
        sequenceOfElements.add(-8);
        sequenceOfElements.add(-1);

        int expectedResult = -11;
        var calculatorObject = new ListCalculator();
        int negativeSum = calculatorObject.getNegativeSum(sequenceOfElements);

        assertEquals(expectedResult, negativeSum);
    }

}