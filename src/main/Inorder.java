package main;

import java.util.List;

public class Inorder {

    public static List<Integer> getTreeElements(Node root, List<Integer> resultElements) {

        if (root == null) {
            return resultElements;
        }
        if (root.getLeftChild() != null) {
            getTreeElements(root.getLeftChild(), resultElements);
        }

        resultElements.add(root.getValue());

        if (root.getRightChild() != null) {
            getTreeElements(root.getRightChild(), resultElements);
        }

        return resultElements;
    }

}
