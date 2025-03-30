package StringProblems;

/**
 * Created By Ravi on 28-01-2023
 **/
public class StringPrefix {
    public static void main(String[] args) {
        String s = "xxyzxxyzwxxyzxxyzx";
        int N = s.length();
        int[] z = new int[N];
        z[0] = N;
        for(int i =1; i<N; i++)
        {
            int j = i;
            int k =0;
            while(j<N && s.charAt(j) == s.charAt(k))
            {
                j++;
                k++;
            }
            z[i] = k;
        }
        for (int i : z) {
            System.out.print(i+" ");
        }
    }
}
