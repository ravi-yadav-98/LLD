#include <bits/stdc++.h>
using namespace std;
/*
Add Comment Here
*/

int minSwap(vector<int> &A, int B)
{
    int i =0;
    int j = A.size();
    int cnt =0;
    while(i<j)
    {
        if(A[i]<=B && A[j]>B)
        {
            i++;
        }
        else if(A[i]>B && A[j]<=B)
        {
            swap(A[i], A[j]);
            cnt++;
            i++;
            j--;
        }
        else if(A[i]<=B && A[j]<=B)
        {
            i++;
        }
        else if(A[i]>B && A[j]>B)
        {
            j--;
        }
    }
    return cnt;
}

int main(void)
{
    vector<int> A = {1, 12, 10, 3, 14, 10, 5};
    int B = 8;
    cout<<minSwap(A, B);
  return 0;
}