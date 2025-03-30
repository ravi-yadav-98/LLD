package StackImplementation;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String s = "a + b*c";
        System.out.println(infixToPostFix(s));
    }
    public static String infixToPostFix(String s)
    {
        int n = s.length();
        StringBuilder ans = new StringBuilder("");
        Stack<Character> st = new Stack<>();

        HashMap<Character, Integer> precedence = new HashMap<>();
        precedence.put('^', 2);
        precedence.put('*', 1);
        precedence.put('/', 1);
        precedence.put('+', 0);
        precedence.put('-', 0);

        for(int i =n-1;i>=0; i--)
        {
            char x = s.charAt(i);
            if(x >='a' && x<='z')
            {
                ans.append(x);
            } else if (x == '(') {
                st.push('(');
            } else if (x == ')') {
                while(st.peek() != '(')
                {
                    ans.append(st.peek());
                    st.pop();
                }
                st.pop();
            }
            else if(x=='+' || x=='-' || x=='*'|| x=='/'|| x=='^') {

                while(!st.isEmpty() && st.peek() != '(' && precedence.get(x)<=precedence.get(st.peek()))
                {
                    ans.append(st.peek());
                    st.pop();
                }
                st.push(x);
            }

        }
        while(!st.isEmpty())
        {
            ans.append(st.peek());
            st.pop();
        }
        return ans.reverse().toString();
    }
}
