#include <bits/stdc++.h>
using namespace std;
/*
Kth element in two sorted array
*/

int kthElement(vector<int> &A, vector<int> &B, int k)
{
    int n = A.size();
    int m = B.size();
    if(n > m)
    {
        return kthElement(B, A,  k);
    }
    
    int l = max(0, k-m);
    int r = min(k, n);
    while(l <= r)
    {
        int cut1 = (l + r) >>1;
        int cut2 =k- cut1;

        int l1 = cut1==0 ? INT_MIN : A[cut1-1];
        int l2 = cut2==0 ? INT_MIN : B[cut2-1];
        int r1 = cut1 == n? INT_MAX : A[cut1];
        int r2 = cut2 ==m ? INT_MAX : B[cut2];
        
        if(l2<=r1 && l1 <= r2)
        {
            return max(l1, l2);
        }
        else if(l1 > r2)
        {
            r = cut1 -1; 
        }
        else
        {
            l = cut1 + 1;
        }

    }
    return 1;
            

}
int main(void)
{
    vector<int> A = {1,3,5,6,8,9};
    vector<int> B = {2,11,13,14,16};
    int k = 6;
    cout<<kthElement(A, B, k);
  return 0;
}