package test;

import main.Inorder;
import main.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class InorderTest {

    @Test
    void getTreeElements() {

        Node root = new Node(5);

        root.setLeftChild(new Node(3));
        root.getLeftChild().setLeftChild(new Node(2));
        root.getLeftChild().setRightChild(new Node(4));

        root.setRightChild(new Node(7));
        root.getRightChild().setLeftChild(new Node(6));
        root.getRightChild().setRightChild(new Node(8));

        List<Integer> resultList = new ArrayList<>();
        List<Integer> expectedResult = List.of(2, 3, 4, 5, 6, 7, 8);

        Inorder T = new Inorder();
        T.getTreeElements(root, resultList);

        Assertions.assertEquals(expectedResult, resultList);



    }
}