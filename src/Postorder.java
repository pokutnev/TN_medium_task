public class Postorder {

    public void getTreeElements(Node root) {

        if (root == null)
            return;
        else {

            if (root.getLeftChild() != null)
                getTreeElements(root.getLeftChild());


            if (root.getRightChild() != null) {
                getTreeElements(root.getRightChild());
            }

            System.out.println("node = " + root.getValue());
        }
    }

}
