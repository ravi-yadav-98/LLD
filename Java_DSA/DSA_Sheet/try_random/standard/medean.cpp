#include <bits/stdc++.h>
using namespace std;
/*
Add Comment Here
*/

double findMedianSortedArrays(const vector<int> &A, const vector<int> &B) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    int n = A.size();
    int m = B.size();
    int N = (m+n)/2;
    int i =0;
    int j =0;
    int M1=-1;
    int M2 = -1;
    for(int count=0; count<=N; count++)
    {
        M2 = M1;
        if(i != n && j != m)
        {
            M1 = (A[i] <= B[j]) ? A[i++] : B[j++];
        }
        else if(i<n)
        {
            M1 = A[i++];

        }
        else
        {
            M1 = B[j++];
        }
        
        


    }
    if((m+n)%2==1)
    {
        return (double) M1;
    }
    else{
        return ((double)M1+(double) M2)/2;
    }

}

int main(void)
{

    vector<int> a = {1,2,3};
    vector<int> b = {4,5,6};
    cout<<findMedianSortedArrays(a, b);
  return 0;
}