package StackImplementation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class InfixPrePostFix {
    public static void main(String[] args) {
        //infix to post fix
        String in = "a/z+b+c-d";
        System.out.println(InfixToPostFix(in));

    }

    public static String InfixToPostFix(String s)
    {
        int n = s.length();
        StringBuilder ans = new StringBuilder("");

        HashMap<Character, Integer>  precedence = new HashMap<>();
        precedence.put('^', 2);
        precedence.put('*', 1);
        precedence.put('/', 1);
        precedence.put('+', 0);
        precedence.put('-', 0);

        Stack<Character> st = new Stack<>();
        for (int i =0; i<n; i++)
        {
            char x = s.charAt(i);
            if(x>='a' && x<='z')
            {
                ans.append(x);
            }
            else if(x=='('){
                st.push(x);
            }
            else if(x == ')')
            {
                while(st.peek() != '(')
                {
                    char c = st.pop();
                    ans.append(c);
                }
                st.pop();
            }

            else if(x=='+' || x=='-' || x=='*'|| x=='/'|| x=='^')
            {

                while(!st.isEmpty() && st.peek() != '('&& ( precedence.get(x)<= precedence.get(st.peek())))
                {
                    char temp = st.pop();
                    ans.append(temp);
                    }
                st.push(x);


            }

        }
        while(!st.isEmpty())
        {
            ans.append(st.peek());
            st.pop();
        }
        return  ans.toString();
    }
}
