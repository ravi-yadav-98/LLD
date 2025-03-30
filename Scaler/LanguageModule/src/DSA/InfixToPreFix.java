package DSA;

import java.util.Stack;

public class InfixToPreFix {
    public static void main(String[] args) {
        String infix = "a+b-c/u";
        System.out.println(convertInfixToPrefix(infix));
    }

    private static String convertInfixToPrefix(String A) {
        StringBuilder ans  = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i=A.length()-1; i>=0; i--)
        {
            char ch = A.charAt(i);

            //case 1: if char is operand: add to results
            if(isOperand(ch))
            {
                ans.append(ch);
            }

            //case:02 open bracket: push to stack
            else if(ch=='(')
            {
                st.push('(');
            }
            //case: 3: closed bracket: pop the stack and append the result to ans
            else if(ch == ')')
            {
                while(st.peek() != '(')
                {
                    ans.append(st.peek());
                    st.pop();
                }
                st.pop(); //pop extra (
            }

            else //operator
            {
                while(!st.isEmpty() && precedence(ch) <= precedence(st.peek()))
                {
                    ans.append(st.peek());
                    st.pop();
                }
                //push to stack
                st.push(ch);
            }
        }

        while(!st.isEmpty())
        {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }

    static boolean isOperand(char ch)
    {
        return (ch >= 'a' && ch <= 'z') ||(ch>='0' && ch<'9');
    }
    static int precedence(char ch)
    {
        if(ch=='^') return 3;
        if(ch == '*' || ch == '/') return 2;
        if(ch =='+' || ch == '-') return 1;
        else return 0;
    }


}
