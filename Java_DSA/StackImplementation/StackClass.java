//package StackImplementation;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class StackClass {
//
//    public static void main(String[] args) {
//
//        Stacks<Integer> s = new Stacks<>();
//        s.push(10);
//        s.push(2);
//
//        System.out.println(s);
//        System.out.println(s.size());
//        System.out.println(s.isEmpty());
//        s.pop();
//        s.pop();
//        System.out.println(s.isEmpty());
//    }
//
//}
//
//
//class Stacks<T>{
//    ArrayList<T> arr;
//    int top;
//    public Stacks()
//    {
//        this.top =  -1;
//        arr = new ArrayList<>();
//    }
//    public  void push(T d)
//    {
//        top = top+1;
//        arr.add(d);
//
//    }
//    public void pop(){
//        if(top != -1)
//        {
//            arr.remove(top);
//            top--;
//        }
//    }
//    public boolean isEmpty()
//    {
//        return top == -1;
//    }
//    public int size()
//    {
//        return top+1;
//    }
//
//    public T top()
//    {
//        if(top == -1)
//        {
//            return null;
//        }
//        else
//        {
//            return arr.get(top);
//        }
//    }
//
//    public String toString()
//    {
//        StringBuilder sb = new StringBuilder("");
//        for(T a: arr){
//            sb.append(a);
//            sb.append(" ");
//        }
//        return sb.toString();
//
//    }
//
//
//
//}
//
//
//class Node<T>{
//    T data;
//    Node next;
//    Node(T d)
//    {
//        data = d;
//        next = null;
//
//    }
//}
//class StackL<T>{
//    Node top;
//    public StackL()
//    {
//        top = null;
//    }
//
//
//    public boolean isEmptry()
//    {
//        return top == null;
//    }
//    public T top()
//    {
//        if(top != null)
//        {
//            return top.data;
//        }
//    }
//}
