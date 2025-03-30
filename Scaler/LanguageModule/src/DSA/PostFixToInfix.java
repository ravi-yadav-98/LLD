package DSA;

import java.util.Stack;

public class PostFixToInfix {
    public static void main(String[] args) {
        //test
        String postfix = "ab+c+";
        System.out.println(getInfix(postfix));
    }
    static String getInfix(String exp)
    {
        Stack<String> s = new Stack<String>();

        for (int i = 0; i < exp.length(); i++)
        {
            // Push operands
            if (isOperand(exp.charAt(i)))
            {
                s.push(exp.charAt(i) + ""); //convert char to string
            }
            else
            {
                String op1 = s.pop();
                String op2 = s.pop();
                s.push("(" + op2 + exp.charAt(i) +
                        op1 + ")");
            }
        }
        return s.peek();
    }
    static boolean isOperand(char ch)
    {
        return ch >= 'a' && ch <= 'z';
    }

}
