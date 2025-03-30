package StringProblems;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created By Ravi on 30-01-2023
 **/
public class KMPAlgo {
    public static void main(String[] args) {
        String text    =  "abaabcdefaabaa";
        String pattern =  "abaa";

//        int[] lps = createLPS(p);

        KMPAlgorithm2(text, pattern);
    }

    private static void KMPAlgorithm2(String  t, String  p)
    {
        //create LPS for pattern
        int[] lps = createLPS(p);
        char[]  text = t.toCharArray();
        int m= text.length;
        char[] pat = p.toCharArray();
        int n = pat.length;
        int i =0;
        int j =0;

        //List to store Match index

        while (i<m)
        {
            if(text[i] == pat[j]) {
                i++;
                j++;
                if (j == n) {
                    System.out.println(i - j);
                    j = lps[j - 1];
                }
            }
            else if(i<m && text[i] != pat[j])
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

        }

    }

    private static boolean KMPAlgorith1(String t, String p)
    {
        int[] lps = createLPS(p);
        char[]  text = t.toCharArray();
        int m= text.length;
        char[] pat = p.toCharArray();
        int n = pat.length;
        int i =0;
        int j =0;
        while (i<m && j<n)
        {
            if(text[i] == pat[j])
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
        }
        if(j ==n)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    private static int[] createLPS(String  s)
    {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] lps = new int[n];
        int i =0;
        int j =1;
        while(j<n)
        {
            if(chars[i]  == chars[j])
            {
                lps[j] = i+1;
                i++;
                j++;
            }
            else
            {
                if(i>0)
                {
                    i = lps[i-1];
                }
                else
                {
                    j++;
                }

            }
        }
        return lps;
    }
}
