package main;

import java.util.List;

public class ListCalculator {

    public static int getPositiveSum(List<Integer> sum) {
        return sum.stream().
                filter(number -> number > 0).
                reduce(0, Integer::sum);
    }

    public static int getNegativeSum(List<Integer> sum) {
        return sum.stream().
                filter(number -> number < 0).
                reduce(0, Integer::sum);
    }

}
