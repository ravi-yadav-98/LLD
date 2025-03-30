package Tree;

public class BinaryTree {
    public static void main(String[] args) {
    //create Binary Tree
        //Root Node
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);
//        System.out.println("InOrder Traversal: ");
//        inOrderTraversal(root);
//        System.out.println();
//        System.out.println("PreOrder Traversal: ");
//        preOrderTraversal(root);
//        System.out.println();
//        System.out.println("Post Order Traversal");
//        postOrderTraversal(root);
        System.out.println("Height: " + height(root));

    }
    public static void print(Node root)
    {
        Node tmp = root;
        while(tmp != null)
        {
            System.out.print(tmp.data + " ");
            tmp = tmp.left;
        }
    }
    public static void inOrderTraversal(Node node)
    {
        //Inorder: left->root-> right
        if(node == null) return;

        inOrderTraversal(node.left);
        System.out.print(node.data+" ");
        inOrderTraversal(node.right);


    }

    public static void preOrderTraversal(Node node)
    {
        if(node == null)
        {
            return;
        }
        //Node--> left-> right
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void postOrderTraversal(Node node)
    {
        if(node == null)
        {
            return;
        }
        //left-> right -> node

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }
    public static int height(Node root)
    {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right))+1;
    }



}
