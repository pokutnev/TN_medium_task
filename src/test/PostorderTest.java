package test;
import main.Node;
import main.Postorder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class PostorderTest {

    @Test
    void getTreeElementsTest() {

        Node root = new Node(5);

        root.setLeftChild(new Node(3));
        root.getLeftChild().setLeftChild(new Node(2));
        root.getLeftChild().setRightChild(new Node(4));

        root.setRightChild(new Node(7));
        root.getRightChild().setLeftChild(new Node(6));
        root.getRightChild().setRightChild(new Node(8));

        List<Integer> resultList = new ArrayList<>();
        List<Integer> expectedResult = List.of(2, 4, 3, 6, 8, 7, 5);

        Postorder T = new Postorder();
        T.getTreeElements(root, resultList);

        Assertions.assertEquals(expectedResult, resultList);

    }
}