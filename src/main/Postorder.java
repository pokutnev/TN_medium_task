package main;

import java.util.List;

public class Postorder {

    public static List<Integer> getTreeElements(Node root, List<Integer> resultElements) {

        if (root == null) {
            return resultElements;
        }
        if (root.getLeftChild() != null) {
            getTreeElements(root.getLeftChild(), resultElements);
        }
        if (root.getRightChild() != null) {
            getTreeElements(root.getRightChild(), resultElements);
        }
        resultElements.add(root.getValue());

        return resultElements;
    }

}
