package test;


import main.Node;
import main.Preorder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PreorderTest {

    @Test
    void getTreeElements() {

        Node root = new Node(5);

        root.setLeftChild(new Node(3));
        root.getLeftChild().setLeftChild(new Node(2));
        root.getLeftChild().setRightChild(new Node(4));

        root.setRightChild(new Node(7));
        root.getRightChild().setLeftChild(new Node(6));
        root.getRightChild().setRightChild(new Node(8));

        List<Integer> expectedResult = List.of(5, 3, 2, 4, 7, 6, 8);

        Preorder T = new Preorder();
        List<Integer> resultList = new ArrayList<>();
        T.getTreeElements(root, resultList);


        Assertions.assertEquals(resultList, expectedResult);

    }
}