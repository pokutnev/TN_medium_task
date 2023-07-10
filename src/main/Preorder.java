package main;

import java.util.List;

public class Preorder {

    public List<Integer> getTreeElements(Node root, List<Integer> resultElements){

        if (root == null) {
            return resultElements;
        }

        resultElements.add(root.getValue());
        getTreeElements(root.getLeftChild(), resultElements);
        getTreeElements(root.getRightChild(), resultElements);

        return resultElements;
    }

}
