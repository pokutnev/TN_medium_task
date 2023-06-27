package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Node root = new Node(5);

        root.setLeftChild(new Node(3));
        root.getLeftChild().setLeftChild(new Node(2));
        root.getLeftChild().setRightChild(new Node(4));

        root.setRightChild(new Node(7));
        root.getRightChild().setLeftChild(new Node(6));
        root.getRightChild().setRightChild(new Node(8));

        List<Integer> resultList = new ArrayList<>();

        Postorder T = new Postorder();
        T.getTreeElements(root, resultList);

        System.out.println(resultList);

    }
}