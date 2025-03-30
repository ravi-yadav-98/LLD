package StringInOne;

import java.util.ArrayList;

public class KMP {
    public static void main(String[] args) {
       String s = "abcaaaaabcaaaabc";
       String p = "abc";
       for(Integer a: KMPSearch(s, p))
       {
           System.out.print(a + " ");
       }
    }
    public static ArrayList<Integer> KMPSearch(String s, String p)
    {
        int n = s.length();
        int k = p.length();
        //create LPS array
        int[] lps = new int[k];
        lps = computeLPSArray(p);
        ArrayList<Integer> ans = new ArrayList<>();

        //String pointer
        int i =0;
        //pattern pointer
        int j =0;
        while(i < n)
        {
            if(s.charAt(i) == p.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                if(j != 0)
                {
                    j = lps[j-1];
                }
                else
                {
                    i++;
                }
            }
            if(j == k)
            {
                ans.add(i-j);
                j = lps[j-1];

            }
        }
        return ans;
    }


    public static int[] computeLPSArray(String pat)
    {
        int k = pat.length();
        int len = 0;
        int i =1;
        int[] lps = new int[k];
        lps[0] = 0;
        while(i < k)
        {
            if(pat.charAt(i) == pat.charAt(len))
            {
                lps[i] = len+1;
                len++;
                i++;
            }
            else {
                if(len != 0)
                {
                    len = lps[len-1];
                }
                lps[i] = 0;
                i++;
            }

        }
        return lps;

    }
}
