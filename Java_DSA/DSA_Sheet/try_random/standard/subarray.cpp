#include <bits/stdc++.h>
using namespace std;
/*
maximum subarray sum of size k
*/
int maxSumSubarray(vector<int> arr, int k)
{
    int currsum =0;
    for(int i =0; i<k; i++)
    {
        currsum += arr[i];
    }
    int maxSum = currsum;
    
    for(int i =1; i+k<=arr.size(); i++)
    {
        
        currsum = currsum + arr[i+k-1] - arr[i-1];
        maxSum = max(maxSum, currsum);
        cout<<i<<" -> "<<currsum <<" -> "<<maxSum<<endl;
    }
    return maxSum;
}
int main(void)
{
    vector<int> arr = {9,10,11,8,7,6,5,4,3,2,1};
    int k = 3;
    cout<<maxSumSubarray(arr, k);
  return 0;
}