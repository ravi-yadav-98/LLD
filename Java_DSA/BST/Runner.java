package BST;

public class Runner {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.addNodeInBST(10);
        bst.addNodeInBST(11);
        bst.addNodeInBST(12);
        bst.addNodeInBST(13);
        bst.addNodeInBST(9);
        bst.addNodeInBST(6);
        bst.addNodeInBST(7);
        bst.addNodeInBST(5);
        bst.print(bst.root);


    }
}
