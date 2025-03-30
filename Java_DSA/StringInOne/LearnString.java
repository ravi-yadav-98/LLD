package StringInOne;

import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String s = "Hey, I am Good. is what about is you??";
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        System.out.println(s.endsWith("you"));
//        System.out.println(s.startsWith("Hey"));

//        StringBuilder sb = new StringBuilder(s);
//        System.out.println(sb.toString());
//        System.out.println(sb.append("Good."));
//        System.out.println(sb.append(new char[]{'y', 'e', 's'}));
//        System.out.println(sb.append('x'));
//        System.out.println(sb.append(true));
//        System.out.println(sb.append(12));
//        System.out.println(sb.append(1.22f));
//        System.out.println(sb.indexOf("I"));
//        System.out.println(sb.length());
//        System.out.println(sb.delete(0, 6));
//        System.out.println(sb.charAt(0));
//        System.out.println(sb.chars());
        StringBuilder sb = new StringBuilder(5);
        sb.append("ravi");
        sb.setCharAt(0, 'R');
//        System.out.println(sb);
//        System.out.println(sb.indexOf("R"));
        sb.reverse();
        System.out.println(sb);


    }
}
