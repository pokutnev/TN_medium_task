package test;

import main.Inorder;
import main.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InorderTest {

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

        List<Integer> treeElements = new ArrayList<>();
        List<Integer> expectedResult = List.of(2, 3, 4, 5, 6, 7, 8);

        var inorderObject = new Inorder();
        inorderObject.getTreeElements(root, treeElements);

        assertEquals(expectedResult, treeElements);
    }

    @Test
    @DisplayName("test method getting tree Elements from list with only left child")
    void getTreeElementsWithoutRightChild() {

        Node root = new Node(5);

        root.setLeftChild(new Node(3));

        List<Integer> treeElements = new ArrayList<>();
        List<Integer> expectedResult = List.of(3, 5);

        var inorderObject = new Inorder();
        inorderObject.getTreeElements(root, treeElements);

        assertEquals(expectedResult, treeElements);
    }

    @Test
    @DisplayName("test method getting tree Elements from list with only right child")
    void getTreeElementsWithoutLeftChild() {

        Node root = new Node(8);

        root.setRightChild(new Node(1));

        List<Integer> treeElements = new ArrayList<>();
        List<Integer> expectedResult = List.of(8, 1);

        var inorderObject = new Inorder();
        inorderObject.getTreeElements(root, treeElements);

        assertEquals(expectedResult, treeElements);
    }

    @Test
    @DisplayName("test method getting tree Elements from list without Elements")
    void getTreeElementsFromEmptyList() {

        Node root = null;

        List<Integer> treeElements = new ArrayList<>();
        List<Integer> expectedResult = List.of();

        var inorderObject = new Inorder();
        inorderObject.getTreeElements(root, treeElements);

        assertEquals(expectedResult, treeElements);
    }

}