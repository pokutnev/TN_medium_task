package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateElements {

    public static List<Integer> getDuplicates(List<Integer> sequenceOfElements) {

        Map<Integer, Integer> uniqueElements = new HashMap<>();

        for (Integer i : sequenceOfElements) {
            uniqueElements.merge(i, 1, Integer::sum);
        }

        List<Integer> duplicateElements = new ArrayList<>();

        for (Map.Entry<Integer, Integer> i : uniqueElements.entrySet()) {
            if (i.getValue() > 1) {
                duplicateElements.add(i.getKey());
            }
        }

        return duplicateElements;
    }

}
