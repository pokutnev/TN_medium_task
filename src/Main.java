import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(12);
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(3);

        List<Integer> resultList = DuplicateElements.getDuplicates(list);

        System.out.println(resultList);

    }

}