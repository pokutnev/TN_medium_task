package main;

import java.util.List;

public class Inorder {

    public List<Integer> getTreeElements(Node root, List<Integer> resultList){

        if (root == null)
            return resultList;
        else{

            if (root.getLeftChild() != null)
                getTreeElements(root.getLeftChild(), resultList);

            resultList.add(root.getValue());

            if (root.getRightChild() != null)
                getTreeElements(root.getRightChild(), resultList);

        }

        return resultList;

    }

}
