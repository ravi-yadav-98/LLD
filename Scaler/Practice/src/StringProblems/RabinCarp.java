package StringProblems;

/**
 * Created By Ravi on 29-01-2023
 **/
public class RabinCarp {
    public static final int d = 256;
    public static void main(String[] args) {
        String text    =  "abaabcdefaabaa";
        String pattern =  "abaa";
        int q = 101;
        search(pattern, text, q);

    }

    private static  void patternMatch_bf(String  s, String p)
    {
        int m = s.length();
        int n = p.length();
        for(int i =0; i<=m-n; i++)
        {
            int j;
            for(j =0; j<n; j++)
            {
                if(s.charAt(i+j) != s.charAt(j))
                {
                    break;
                }
            }
            if(j == n)
            {
                System.out.print(i + " ");
            }
        }
    }
    private static void search(String  pat, String  txt, int q)
    {
        int M = pat.length();
        int N = txt.length();
        int i, j;
        //find hash value of pat;
        int p =0;
        //hash value of txt
        int t =0;
        int h = 1;

        //h -> pow(h,m-1)%q
        for(i =0; i<M-1; i++)
        {
            h = (h*d)%q;
        }
        for(i =0; i<M; i++)
        {
            p = (d*p+pat.charAt(i))%q;
            t =(d*t+txt.charAt(i))%q;
        }

        //slide
        for( i =0; i<=N-M; i++)
        {
            if(p == t)
            {
                //compare char by char
                for(j =0; j<M; j++)
                {
                    if(txt.charAt(i+j) != pat.charAt(j))
                    {
                        break;
                    }
                }
                if(j ==M)
                {
                    System.out.println(i);
                }
            }
            if(i<N-M)
            {
                t = (d*(t-txt.charAt(i)*h) + txt.charAt(i+M))%q;

                if(t<0)
                {
                    t = t+q;
                }
            }
        }
    }

}
