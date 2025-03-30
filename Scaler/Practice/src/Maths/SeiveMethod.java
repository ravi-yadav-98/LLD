package Maths;

import java.util.Arrays;

/**
 * Created By Ravi on 08-02-2023
 **/
public class SeiveMethod {
    public static void main(String[] args) {
        //print prime number from 1 to 100
//        sieveOfEratosthenes(100);
        lowest_highest_prime(50);
    }


    private static void sieveOfEratosthenes(int n)
    {
        boolean[] isprime = new boolean[n+1];
        Arrays.fill(isprime, true);
        isprime[0] = isprime[1] = false;
        for(int i =2; i<=n; i++)
        {
            if(isprime[i])
            {
                for(int j= 2*i; j<=n; j +=i)
                {
                    isprime[j] = false;
                }
            }
        }

        //print
        for(int i=2; i<=n; i++)
        {
            if(isprime[i])
            {
                System.out.print(i+" ");
            }
        }
    }


    private static void lowest_highest_prime(int n)
    {
        boolean[] isprime = new boolean[n+1];
        Arrays.fill(isprime, true);
        isprime[0] = isprime[1] = false;
        int[] lp = new int[n+1];
        int[] hp = new int[n+1];
        for(int i =2; i<=n; i++)
        {
            if(isprime[i])
            {
                lp[i] = hp[i] = i;
                for(int j= 2*i; j<=n; j +=i)
                {
                    isprime[j] = false;
                    hp[j] = i;
                    if(lp[j] == 0)
                    {
                        lp[j] = i;
                    }
                }
            }
        }

        //print
        for(int i=2; i<=n; i++)
        {

            System.out.print(lp[i]+" ");

        }
        System.out.println();
        for(int i=2; i<=n; i++)
        {

            System.out.print(hp[i]+" ");

        }

    }
}
