package test;

import main.ListCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


class ListCalculatorTest {

    @Test
    void getPositiveSum() {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(5);
        list.add(-2);
        list.add(4);
        list.add(-8);
        list.add(-1);

        int expectedResult = 14;

        int positiveSum = ListCalculator.getPositiveSum(list);

        Assertions.assertEquals(expectedResult, positiveSum);


    }

    @Test
    void getNegativeSum() {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(5);
        list.add(-2);
        list.add(4);
        list.add(-8);
        list.add(-1);

        int expectedResult = -11;

        int negativeSum = ListCalculator.getNegativeSum(list);

        Assertions.assertEquals(expectedResult, negativeSum);



    }
}