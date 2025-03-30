package Tree;

public class Runner {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        TraversalMethods t = new TraversalMethods(root);
//        t.levelOrder();
//        t.preOrder();
//        t.inOrder();
//        t.postOrder();
//        System.out.println( t.maxDepth(root));
//        System.out.println(t.isBalanceBT(root));
//        System.out.println("Total number of nodes: " + t.size(root));
//        System.out.println("Sum of all nodes: " + t.sum(root));
        System.out.println(t.serialize(root));



    }
}
