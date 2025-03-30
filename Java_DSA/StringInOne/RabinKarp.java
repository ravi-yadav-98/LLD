package StringInOne;

import java.util.ArrayList;
import java.util.Arrays;

public class RabinKarp {
    public static void main(String[] args) {
        String s =  "abbbbbbbbbbccccccabcabc";
        String p = "abc";
        rabinKarpAlgo(s, p);
//        System.out.println(getStringHash(s));


    }

    public static int getStringHash(String s)
    {
        int prime = 31;
        int M = 1000000007;

        int hash = s.charAt(0)-'a'+1;
        for(int i=1; i<s.length(); i++)
        {
            hash += (s.charAt(i)-'a'+1)*prime;
            prime *= prime;
        }
        return hash%M;

    }
    public static void  rabinKarpAlgo(String S, String P)
    {
        int k = P.length();
        int n = S.length();

        int prime = 31;
        int M    = 1000000007;
        //generate power
        long[] pows = new long[n]; //0 to n-1 power values
        pows[0] = 1;

        for(int i =1;i<n; i++)
        {
            pows[i] = (pows[i-1] * prime)%M;
        }

        //calculate hash value for pattern
        long patternHash = P.charAt(0)-'a'+1;
        for(int i =1; i<k; i++)
        {
            patternHash += ((P.charAt(i)-'a'+1)*pows[i])%M;
        }

        //generate prefix hashcode

        long[] hashCodes = new long[n]; //
        hashCodes[0] = S.charAt(0)-'a'+1;
        for(int i =1; i<n; i++)
        {
            hashCodes[i] = (hashCodes[i-1] + (S.charAt(i)-'a'+1)*pows[i])%M;

        }
        //iterate over string to match
        int start = 0;
        int end = k-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(end < n)
        {
            long winHashCode = hashCodes[end];
            if(start > 0)
            {
                //prefix
                winHashCode = (winHashCode - hashCodes[start -1] + M)%M;
            }
            //check if hashcodes are equal
            if(winHashCode == (patternHash*pows[start])%M)
            {
                ans.add(start);
            }
            start++;
            end++;

        }
        for(Integer a: ans)
        {
            System.out.print(a + " ");
        }


    }
}
