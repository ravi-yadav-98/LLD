public class Subsets
{
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        subsetSum(arr, 0, 0);

    }
    public static void subsetSum(int[] arr, int index, int sum)
    {
        if(index == arr.length)
        {
            System.out.print(sum + " ");
            return;
        }
        //take
        sum += arr[index];
        subsetSum(arr, index+1, sum);

        //backtrack
        sum -= arr[index];
        //not take

        subsetSum(arr, index+1, sum);
    }
}
