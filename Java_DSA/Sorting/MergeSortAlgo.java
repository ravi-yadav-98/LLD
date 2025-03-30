package Sorting;

public class MergeSortAlgo {
    public static void main(String[] args) {

    }
}
class Solution {
    long inCount=0;
    public int solve(int[] A) {
        mergeSort(A, 0, A.length-1);
        return (int) (inCount%1000000007);
    }

    void mergeSort(int[] A, int s, int e) {
        if(s>=e)
            return;
        int m = (s+e)/2;
        mergeSort(A, s, m);
        mergeSort(A, m+1, e);
        merge(A, s, m, e);
    }

    void merge(int[] arr, int s, int m, int e) {
        int[] a1= new int[m-s+1];
        int[] a2= new int[e-m];
        int i=0,j=0,k=s;
        while(i<a1.length) {
            a1[i]=arr[s+i];
            i++;
        }
        i=0;
        while(i<a2.length) {
            a2[i]=arr[m+i+1];
            i++;
        }
        i=0;
        while(i<a1.length && j<a2.length) {
            // Before merging the array count the reverse pairs
            long l1 = a1[i];
            long l2 = a2[j];
            if(l1>2*l2) {
                inCount += a1.length-i;
                j++;
            } else
                i++;
        }
        i=0;
        j=0;
        while(i<a1.length && j<a2.length) {
            if(a1[i]>a2[j]) {
                arr[k++]=a2[j++];
            } else {
                arr[k++]=a1[i++];
            }
        }
        while(i<a1.length)
            arr[k++]=a1[i++];

        while(j<a2.length)
            arr[k++]=a2[j++];
    }
}
