import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(5);
        list.add(-2);
        list.add(4);
        list.add(-8);
        list.add(-1);

        int negativeSum = ListCalculator.getNegativeSum(list);
        int positiveSum = ListCalculator.getPositiveSum(list);
        System.out.println("Сумма отрицательных " + negativeSum);
        System.out.println("Сумма положительных " + positiveSum);




    }
}