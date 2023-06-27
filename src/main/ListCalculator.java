package main;

import java.util.List;
import java.util.stream.Stream;

public class ListCalculator {

    public static int getPositiveSum(List<Integer> list) {

        return list.stream().filter(number -> number > 0).reduce(0, Integer::sum);

    }

    public static int getNegativeSum(List<Integer> list) {
        return list.stream().filter(number -> number < 0).reduce(0, Integer::sum);
    }

}
