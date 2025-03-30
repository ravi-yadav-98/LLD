package StackImplementation;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(4);
        s.push(11);
        System.out.println(s);
        sortStack(s);
        System.out.println(s);
    }

    private static void sortStack(Stack<Integer> s) {

        if(s.isEmpty())
        {
            return;
        }
        int x = s.pop();
        sortStack(s);
        insertAtSortedPos(s, x);
    }

    private static void insertAtSortedPos(Stack<Integer> s, int x)
    {
        if(s.isEmpty() || (!s.isEmpty() && s.peek()<x))
        {
            s.push(x);
            return;
        }
        int n = s.pop();
        insertAtSortedPos(s, x);
        s.push(n);

    }

}
