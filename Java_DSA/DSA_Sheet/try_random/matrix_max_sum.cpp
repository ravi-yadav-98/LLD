#include <bits/stdc++.h>
using namespace std;
/*
Add Comment Here
*/

int kadane(vector<int> &v)
{
    int size = v.size();
    int currsum = 0;
    int ans = INT_MIN;
    for(int i =0; i<size; i++)
    {
        currsum += v[i];
        ans = max(ans, currsum);
        if(currsum<0)
        {
            currsum = 0;
        }
    }
    return ans;
}

int solve(vector<vector<int>> A) {
    int R = A.size();
    int C = A[0].size();
   //sum   
    int maxsum = INT_MIN;
    
    for(int cStart=0; cStart<C; cStart++)
    {
         vector<int> sum(R, 0);
        for(int cEnd =cStart; cEnd<C; cEnd++)
        {
            for(int row =0; row<R; row++)
            {
                sum[row] = sum[row] + A[row][cEnd];
            }
            int currsum = kadane(sum);
            maxsum = max(maxsum, currsum);
        }
    }
    return maxsum;
}

int main(void)
{

    vector<vector<int>> A = {{-6, -21, 27, 19, 19}, {0, 0, 5, -21, 19}, {18, -27, -2, -7, 13}, {-21, -17, -25, -1, 3},{0, -9, -6, -16, -5}, {29, 9, -25, -7, -25}};
    int a  = solve(A);
    cout<<a<<endl;
  return 0;
}