package BST;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    TreeNode root;
    public BinarySearchTree(TreeNode r)
    {
        root = r;
    }
    public BinarySearchTree()
    {
        root = null;
    }
    public void addNodeInBST(int d)
    {
        if(root == null)
        {
            TreeNode node = new TreeNode(d);
            root = node;
            return;
        }
        TreeNode temp = root;
        TreeNode parent = root;
        while(temp != null)
        {
            parent = temp;
            if(d > temp.data)
            {

                temp = temp.right;
            }
            else
            {
                temp = temp.left;
            }
        }
        TreeNode n = new TreeNode(d);
        if(d > parent.data)
        {
            parent.right = n;
        }
        else {
            parent.right = n;
        }

    }
    public void levelOrder() {
        if (root == null) return;
        TreeNode temp = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(temp);
        while (!q.isEmpty()) {
            int levelNum = q.size();
            for (int i = 0; i < levelNum; i++) {

                if (q.peek().left != null) q.add(q.peek().left);
                if (q.peek().right != null) q.add(q.peek().right);
                System.out.print(q.poll().data + " ");
            }
        }

        System.out.println();

    }
    public void print(TreeNode root)
    {
        if(root == null) return;
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }
}
