public class Preorder {

    public void getTreeElements(Node root){

        if (root == null)
            return;
        else{
            System.out.println("node = " + root.getValue());
            getTreeElements(root.getLeftChild());
            getTreeElements(root.getRightChild());

        }

    }

}
