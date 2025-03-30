package StackImplementation;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        insertAtBottom(s,-100);
        System.out.println(s);

    }

    private static void insertAtBottom(Stack<Integer> s, int val) {
        if(s.isEmpty())
        {
            s.push(val);
            return;
        }
        int x = s.pop();
        insertAtBottom(s, val);
        s.push(x);
    }
}
