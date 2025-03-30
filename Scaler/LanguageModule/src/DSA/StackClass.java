package DSA;

import Lecture_03.StreamOps;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
       st.push(2);
       st.push(21);
       st.push(-1);
       st.push(101);
       st.push(1);
       st.push(0);
//        sortStack(st);

        insertAtBottom(st, 100);
        reverse(st);

        while (!st.isEmpty())
        {
            System.out.print(st.pop() + " ");
        }

    }

    private static void sortStack(Stack<Integer> st) {
        Deque<Integer> temp = new ArrayDeque<>();
        while(!st.isEmpty())
        {
            int top = st.pop();
            if(temp.isEmpty() || temp.peek() <= top)
            {
                temp.push(top);
            }
            else
            {
                while (!temp.isEmpty() && temp.peek() > top)
                {
                    st.push(temp.poll());
                }
                temp.push(top);
            }
        }

        while (!temp.isEmpty())
        {
            st.push(temp.pop());
        }

    }

    static void insertAtBottom(Stack<Integer> st, int val)
    {
        if(st.isEmpty())
        {
            st.push(val);
            return;
        }

        int x= st.pop();
        insertAtBottom(st, val);

        st.push(x);

    }

    static void reverse(Stack<Integer> st)
    {
        if(st.isEmpty())
        {
            return;
        }

        int x = st.pop();
        reverse(st);
        insertAtBottom(st, x);
    }
}
