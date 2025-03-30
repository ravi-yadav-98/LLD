package DP;

/**
 * Created By Ravi on 19-02-2023
 **/
public class PrintLCS {
    static int[][] dp = new int[100][100];
    public static void main(String[] args) {
        String s1 = "abdfghk";
        String s2 ="aibdfhfd";
        int m = s1.length();
        int n = s2.length();
        int lcs = LCS(s1, s2, m , n);
        System.out.println("length of lcs: "+ lcs);
        String ls = printLCS(dp, s1, s2, m, n);
        System.out.println("LCS is: "+ ls);



    }
    private static int LCS(String s1, String s2, int m, int n)
    {
        for(int i=1; i<=m; i++)
        {
            for(int j =1; j<=n; j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }

    private static String printLCS(int[][] dp, String s1, String s2, int m, int n)
    {
        StringBuilder sb = new StringBuilder("");
        int i =m;
        int j= n;
        while(i>0 && j>0)
        {
            if(s1.charAt(i-1) == s2.charAt(j-1))
            {
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else {
                if(dp[i-1][j] > dp[i][j-1])
                {
                    i--;
                }
                else {
                    j--;
                }
            }
        }

        return sb.reverse().toString();
    }
}
