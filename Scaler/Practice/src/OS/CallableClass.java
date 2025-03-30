package OS;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created By Ravi on 06-03-2023
 **/
public class CallableClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrToSort = List.of(10,2,8,11,4,3,9,1);
        ExecutorService e = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(arrToSort);
        Future<List<Integer>> futureSoredList =  e.submit(sorter);
        List<Integer> sortedList = futureSoredList.get();
        for(int a: sortedList)
        {
            System.out.print(a+" ");
        }
        e.shutdown();

    }
}
class Sorter implements Callable<List<Integer>>
{
    private List<Integer> arr;
    public Sorter(List<Integer> arr)
    {
        this.arr = arr;
    }
    @Override
    public List<Integer> call() throws  Exception
    {
        if(arr.size() <= 1) return arr;

        int mid = arr.size()/2;
        List<Integer> leftArr = new ArrayList<>();
        List<Integer> rightArr = new ArrayList<>();

        for(int i =0; i<mid; i++)
        {
            leftArr.add(arr.get(i));

        }
        for(int i = mid; i<arr.size(); i++)
        {
            rightArr.add(arr.get(i));
        }
        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter leftSorter = new Sorter(leftArr);
        Sorter rightSorter = new Sorter(rightArr);
        Future<List<Integer>> leftSortedArrFuture = executorService.submit(leftSorter);
        Future<List<Integer>>rightSortedArrFuture = executorService.submit(rightSorter);

        //merge
        int i =0;
        int j= 0;
        List<Integer> leftSortedArr = leftSortedArrFuture.get();
        List<Integer> rightSortedArr = rightSortedArrFuture.get();
        // if future is not yet done: get() will block , won't go next line

        List<Integer> sortedArr = new ArrayList<>();
        while(i<leftSortedArr.size() && j < rightSortedArr.size())
        {
            if(leftSortedArr.get(i)<= rightSortedArr.get(j))
            {
                sortedArr.add(leftSortedArr.get(i));
                i++;
            }
            else {
                sortedArr.add(rightSortedArr.get(j));
                j++;
            }
        }
        while(i<leftSortedArr.size())
        {
            sortedArr.add(leftSortedArr.get(i));
            i++;
        }
        while(j<rightSortedArr.size())
        {
            sortedArr.add(rightSortedArr.get(j));
            j++;
        }
        executorService.shutdown();
        return  sortedArr;


    }
}
