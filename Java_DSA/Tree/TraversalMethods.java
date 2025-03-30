package Tree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TraversalMethods {
    Node root;

    public TraversalMethods(Node r) {
        root = r;
    }

    public void levelOrder() {
        if (root == null) return;
        Node temp = root;
        Queue<Node> q = new LinkedList<>();
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

    public void preOrder() {
        Node temp = root;
        Stack<Node> st = new Stack<>();
        if (root == null) return;
        st.push(temp);
        while (!st.isEmpty()) {
            temp = st.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                st.push(temp.right);
            }
            if (temp.left != null) {
                st.push(temp.left);
            }
        }
        System.out.println();
    }

    public void inOrder() {
        if (root == null) return;
        Node temp = root;
        Stack<Node> st = new Stack<>();
        while (true) {
            if (temp != null) {
                st.push(temp);
                temp = temp.left;
            } else {
                if (st.isEmpty()) break;
                temp = st.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;

            }
        }
        System.out.println();
    }

    public void postOrder() {
        if (root == null) return;
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        Node temp = root;
        st1.push(temp);
        while (!st1.isEmpty()) {
            temp = st1.pop();
            st2.push(temp);
            if (temp.left != null) st1.push(temp.left);
            if (temp.right != null) st1.push(temp.right);
        }

        while(!st2.isEmpty())
        {
            System.out.print(st2.pop().data +  " ");
        }
        System.out.println();

    }

    public int maxDepth(Node root)
    {
        if(root== null) return 0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        return 1 + Math.max(lh, rh);
    }
    public int check(Node root)
    {
        if(root == null) return 0;
        int lh = check(root.left);
        int rh = check(root.right);
        if(Math.abs(rh - lh) > 1) return  -1;
        return Math.max(lh, rh) +1;
    }
    public boolean isBalanceBT(Node root)
    {
        return check(root) != -1;
    }

    public int size(Node root)
    {
        if(root == null) return 0;
        return size(root.left) + size(root.right) + 1;
    }
    public int sum(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        return sum(root.left) + sum(root.right) + root.data;
    }

    public String serialize(Node root)
    {
        if(root == null) return "";
        StringBuilder sb = new StringBuilder("");
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            if(temp == null)
            {
                sb.append("#");
                continue;
            }
            sb.append(temp.data);
            q.add(temp.left);
            q.add(temp.right);

        }
        return sb.toString();

    }


}
