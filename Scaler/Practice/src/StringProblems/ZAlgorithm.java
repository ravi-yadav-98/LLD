package StringProblems;
/**
 * Created By Ravi on 28-01-2023
 **/
public class ZAlgorithm {
    public static void main(String[] args) {
        String s   = "abcdefgkijklghifghsd";
        String  p  = "ghi";
        int idx = isMatched(s, p);
        if(idx != -1)
        {
            System.out.println("Pattern Matched at index: " + idx);
        }
        else
        {
            System.out.println("Pattern does not found !!!");
        }
    }
    private static int isMatched(String s, String p)
    {
        String newStr = p + "$"+s;
        int[] z = zScore(newStr);
        for(int i =0; i<z.length; i++)
        {
            if(z[i] == p.length())
            {
                return i-p.length()-1;  // original = modified-pattern-$
            }
        }
        return -1;
    }
    private static int[] zScore(String  s)
    {
        int n = s.length();
        int[] Z = new int[n];

        //window left, right pointer
        int left = 0;
        int right =0;
        Z[0] = n;
        for(int i =1; i<n; i++)
        {
            //case: i> right : nothing matches: will use brute force to calculate z score
            if(i > right)
            {
                left = right = i;

                while(right <n && s.charAt(right-left) == s.charAt(right))
                {
                    right++;
                }
                Z[i] = right-left;
                right--;
            }
            else
            {
                //k = i-left: number of matches in [left, right] interval
                int k = i-left;
                if(Z[k] < right -i +1)
                {
                    Z[i] = Z[k];
                }
                else
                {
                    left =i;
                    while(right<n && s.charAt(right-left) == s.charAt(right))
                    {
                        right++;
                    }
                    Z[i] = right -left;
                    right--;
                }
            }
        }
        return Z;
    }
}
