package test;

import main.Node;
import main.Postorder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


class PostorderTest {

    @Test
    @DisplayName("test method getting tree Elements from list with Elements")
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

        Postorder postorderObject = new Postorder();
        postorderObject.getTreeElements(root, resultList);

        Assertions.assertEquals(expectedResult, resultList);
    }

    @Test
    @DisplayName("test method getting tree Elements from list without Elements")
    void getTreeElementsFromEmptyList() {

        Node root = null;

        List<Integer> methodResult = new ArrayList<>();
        List<Integer> expectedResult = List.of();

        Postorder postorderObject = new Postorder();
        postorderObject.getTreeElements(root, methodResult);

        Assertions.assertEquals(expectedResult, methodResult);
    }
}