import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3,4};
        int n = arr.length;
        boolean[] freq = new boolean[n];
        ArrayList<Integer> temp = new ArrayList<>();
//        permutations1(arr, temp, freq, n);
        permutations2(arr, 0, n);
    }
    public  static void permutations1(int[] arr, ArrayList<Integer> temp, boolean[] freq, int n) {
        if (temp.size() == n) {
            System.out.println(temp);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                temp.add(arr[i]);
                permutations1(arr, temp, freq, n);
                temp.remove((temp.size() - 1));
                freq[i] = false;
            }
        }
    }
        public  static void permutations2(int[] arr, int index,  int n)
        {
            if(index==n)
            {
               for(Integer a: arr) {
                   System.out.print(a + " ");
               }
                System.out.println();
                return;
            }

            for(int i = index;i<n; i++)
            {
                swap(i, index, arr);

                permutations2(arr,index+1, n);
                swap(i, index, arr);



            }
        }
        private static void swap(int i , int j, int[] arr)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

}
