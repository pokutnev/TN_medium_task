package test;

import main.DuplicateElements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class DuplicateElementsTest {

    @Test
    void getDuplicatesTest() {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(12);
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(3);

        List<Integer> expectedResult = List.of(1, 3, 4);

        List<Integer> resultList = DuplicateElements.getDuplicates(list);

        Assertions.assertEquals(expectedResult, resultList);


    }
}