import java.util.ArrayList;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        ArrayList<Integer> temp = new ArrayList<>();
        combinationSum(arr, 0, target, temp);
    }
    public static void combinationSum(int[] arr, int index, int target,  ArrayList<Integer> temp)
    {
        if(index == arr.length)
        {
            if(target ==0)
            {
                System.out.println(temp);
            }
            return;
        }
        if(arr[index] <= target)
        {
            temp.add(arr[index]);
            combinationSum(arr, index, target-arr[index], temp);

            temp.remove(temp.size()-1);

       }
        combinationSum(arr, index+1, target, temp);
    }
}
