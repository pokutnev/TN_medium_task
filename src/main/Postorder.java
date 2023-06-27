package main;

import main.Node;

import java.util.List;

public class Postorder {

    public List<Integer> getTreeElements(Node root, List<Integer> resultList) {

        if (root == null)
            return resultList;
        else {

            if (root.getLeftChild() != null)
                getTreeElements(root.getLeftChild(), resultList);


            if (root.getRightChild() != null) {
                getTreeElements(root.getRightChild(), resultList);
            }

            resultList.add(root.getValue());
        }

        return resultList;
    }

}
