package test;

import main.Node;
import main.Postorder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


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

        List<Integer> treeElements = new ArrayList<>();
        List<Integer> expectedResult = List.of(2, 4, 3, 6, 8, 7, 5);

        var postorderObject = new Postorder();
        postorderObject.getTreeElements(root, treeElements);

        assertEquals(expectedResult, treeElements);
    }

    @Test
    @DisplayName("test method getting tree Elements from list without right child")
    void getTreeElementsWithoutRightChild() {

        Node root = new Node(5);
        root.setLeftChild(new Node(3));

        List<Integer> expectedResult = List.of(3, 5);

        List<Integer> treeElements = new ArrayList<>();
        var postorderObject = new Postorder();
        postorderObject.getTreeElements(root, treeElements);

        assertEquals(expectedResult, treeElements);
    }

    @Test
    @DisplayName("test method getting tree Elements from list without right child")
    void getTreeElementsWithoutLeftChild() {

        Node root = new Node(8);

        root.setRightChild(new Node(2));

        List<Integer> expectedResult = List.of(2, 8);

        List<Integer> treeElements = new ArrayList<>();
        var postorderObject = new Postorder();
        postorderObject.getTreeElements(root, treeElements);

        assertEquals(expectedResult, treeElements);
    }

    @Test
    @DisplayName("test method getting tree Elements from list without Elements")
    void getTreeElementsFromEmptyList() {

        Node root = null;

        List<Integer> methodResult = new ArrayList<>();
        List<Integer> expectedResult = List.of();

        var postorderObject = new Postorder();
        postorderObject.getTreeElements(root, methodResult);

        assertEquals(expectedResult, methodResult);
    }
}