package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DP {
    //print matrix
    static void print(int[][] A)
    {
        for(int i =0; i<A.length; i++)
        {
            for(int j =0; j<A[0].length; j++)
            {
                if(A[i][j] != 0)
                    System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    //calculate nCr
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter r: ");
        int r  = sc.nextInt();

//        int[][] dp = new int[n+1][r+1];
//        for(int[] row: dp)
//        {
//            Arrays.fill(row, -1);
//        }
//        System.out.println(n+"C"+r +" -> " + calculateNCR(n,r, dp));
        int[][] dp2= new int[n+1][r+1];
        calculateNCR2(n, r, dp2);
        print(dp2);
    }

    static int calculateNCR(int n, int r, int[][] dp)
    {
        if(r>n) return 0;
        if(r ==0) return 1;
        if(r==n) return 1;
        if(n<=1) return 1;
        if(dp[n][r] != -1)
        {
            return dp[n][r];
        }
        dp[n][r] = calculateNCR(n-1, r, dp) + calculateNCR(n-1, r-1, dp);
        return dp[n][r];
    }

    static void calculateNCR2(int n, int r, int[][] dp)
    {
        //if r ==0 return 1 if(n==r) return 1
       for(int i =0; i<=n; i++)
       {
           for(int j =0;j<=Math.min(r,i); j++)
           {
               if(j ==0 || j==i)
               {
                   dp[i][j] = 1;
               }
               else
               {
                   dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
               }
           }
       }
    }

}
