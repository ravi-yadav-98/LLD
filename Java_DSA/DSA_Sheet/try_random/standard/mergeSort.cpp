#include <bits/stdc++.h>
using namespace std;
/*
Merge Sort
*/


using namespace std;
 
// A function to merge the two half into a sorted data.
void Merge(vector<int> &a, int low, int high, int mid)
{
	// We have low to mid and mid+1 to high already sorted.
	int i, j, k;
    vector<int> temp(100,0); //high-low+1
	i = low;
	k = low; ///can be 0
	j = mid + 1;
 
	// Merge the two parts into temp[].
	while (i <= mid && j <= high)
	{
		if (a[i] <= a[j])
		{
			temp[k] = a[i];
			k++;
			i++;
		}
		else
		{
			temp[k] = a[j];
			k++;
			j++;
		}
	}
 
	// Insert all the remaining values from i to mid into temp[].
	while (i <= mid)
	{
		temp[k] = a[i];
		k++;
		i++;
	}
 
	// Insert all the remaining values from j to high into temp[].
	while (j <= high)
	{
		temp[k] = a[j];
		k++;
		j++;
	}
 
 
	// Assign sorted data stored in temp[] to a[].
	for (i = low; i <k; i++)
	{
		a[i] = temp[i];
	}
}
 
// A function to split array into two parts.
void MergeSort(vector<int> &a, int low, int high)
{
	int mid;
	if (low < high)
	{
		mid=(low+high)/2;
		// Split the data into two half.
		MergeSort(a, low, mid);
		MergeSort(a, mid+1, high);
 
		// Merge them to get sorted output.
		Merge(a, low, high, mid);
	}
}
int main(void)
{
    vector<int> a = {2,8,4,12,23,9,0,32,3,2};
    int n = a.size();
    // cout<<"i/p: unsorted array"<<endl;
    // for(int a: arr)
    // {
    //     cout<<a<<" ";
    // }
    // cout<<endl;
      cout<<"o/p: sorted array"<<endl;
    MergeSort(a, 0, 9);

  
    for(int i: a)
    {
        cout<<i<<" ";
    }
    cout<<endl;
  return 0;
}