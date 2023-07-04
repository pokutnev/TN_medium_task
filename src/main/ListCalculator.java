package main;

import java.util.List;

public class ListCalculator {

    public int getPositiveSum(List<Integer> sum) {
        return sum.stream().
                filter(number -> number > 0).
                reduce(0, Integer::sum);
    }

    public int getNegativeSum(List<Integer> sum) {
        return sum.stream().
                filter(number -> number < 0).
                reduce(0, Integer::sum);
    }

}
