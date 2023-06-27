package main;

import java.util.ArrayList;
import java.util.List;

public class Preorder {

    public List<Integer> getTreeElements(Node root, List<Integer> resultList){

        if (root == null) {
            return resultList;
        }
        else{
            resultList.add(root.getValue());
            getTreeElements(root.getLeftChild(), resultList);
            getTreeElements(root.getRightChild(), resultList);

        }

        return resultList;

    }

}
