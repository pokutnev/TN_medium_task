package test;

import main.Node;
import main.Preorder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PreorderTest {

    @Test
    @DisplayName("test method getting tree Elements from list with Elements")
    void getTreeElementsFromFullList() {

        Node root = new Node(5);

        root.setLeftChild(new Node(3));
        root.getLeftChild().setLeftChild(new Node(2));
        root.getLeftChild().setRightChild(new Node(4));

        root.setRightChild(new Node(7));
        root.getRightChild().setLeftChild(new Node(6));
        root.getRightChild().setRightChild(new Node(8));

        List<Integer> expectedResult = List.of(5, 3, 2, 4, 7, 6, 8);

        List<Integer> methodResult = new ArrayList<>();
        Preorder.getTreeElements(root, methodResult);

        Assertions.assertEquals(expectedResult, methodResult);
    }

    @Test
    @DisplayName("test method getting tree Elements from list without Elements")
    void getTreeElementsFromEmptyList() {

        Node root = null;

        List<Integer> expectedResult = List.of();

        List<Integer> methodResult = new ArrayList<>();
        Preorder.getTreeElements(root, methodResult);

        Assertions.assertEquals(expectedResult, methodResult);
    }

}