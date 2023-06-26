public class Inorder {

    public void getTreeElements(Node root){

        if (root == null)
            return;
        else{

            if (root.getLeftChild() != null)
                getTreeElements(root.getLeftChild());

            System.out.println("node = " + root.getValue());

            if (root.getRightChild() != null)
                getTreeElements(root.getRightChild());

        }

    }

}
