package StringInOne;

import java.util.Arrays;

public class RollingHash {
    public static void main(String[] args) {
        String s = "cbaaaaaaaaacbaaaaaabbbcbaaaaa";
        String pattern = "cba";
        for(Integer a: stringMatch(s, pattern))
        {
            System.out.print(a + " ");
        }

    }

    public static int[] stringMatch(String s, String  pattern)
    {
        int k = pattern.length();
        int n = s.length();
        if(k>n)return new int[] {};
        //get hash value for pattern

        int[] ans = new int[n];
        int temp =0;
        int patternHashCode = 0;
        int currWindowHashCode = 0;
        for(int i =0; i<k; i++)
        {
            patternHashCode += (pattern.charAt(i) -'a' +1);
            currWindowHashCode += (s.charAt(i) -'a' +1);
        }
//        System.out.println("Pattern Code: "+ patternHashCode);

        //compare
        if(currWindowHashCode == patternHashCode && compareStr(s.substring(0, k), pattern))
        {
            ans[temp++] = 0;
        }
        //sliding window
        for(int i = 1; i+k-1<n; i++)
        {
            currWindowHashCode -= (s.charAt(i-1) -'a' +1);
            currWindowHashCode += (s.charAt(i+k-1) -'a' +1);
//            System.out.println(s.substring(i, i+k) + " - "+ currWindowHashCode);

            if(currWindowHashCode == patternHashCode && compareStr(s.substring(i, i+k), pattern))
            {
                ans[temp++] = i;
            }
        }
        return Arrays.copyOf(ans, temp);


    }
    public static boolean compareStr(String s1, String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        for(int i =0; i<s1.length(); i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                return  false;
            }
        }
        return true;
    }


    public static int[] rabinKarp(String s, String  pattern)
    {
        int k = pattern.length();
        int n = s.length();
        if(k>n)return new int[] {};
        //get hash value for pattern

        int[] ans = new int[n];
        int temp =0;
        int patternHashCode = 0;
        int currWindowHashCode = 0;
        for(int i =0; i<k; i++)
        {
            patternHashCode += (pattern.charAt(i) -'a' +1);
            currWindowHashCode += (s.charAt(i) -'a' +1);
        }
//        System.out.println("Pattern Code: "+ patternHashCode);

        //compare
        if(currWindowHashCode == patternHashCode && compareStr(s.substring(0, k), pattern))
        {
            ans[temp++] = 0;
        }
        //sliding window
        for(int i = 1; i+k-1<n; i++)
        {
            currWindowHashCode -= (s.charAt(i-1) -'a' +1);
            currWindowHashCode += (s.charAt(i+k-1) -'a' +1);
//            System.out.println(s.substring(i, i+k) + " - "+ currWindowHashCode);

            if(currWindowHashCode == patternHashCode && compareStr(s.substring(i, i+k), pattern))
            {
                ans[temp++] = i;
            }
        }
        return Arrays.copyOf(ans, temp);


    }
}




