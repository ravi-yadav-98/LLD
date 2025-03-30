#include <bits/stdc++.h>
using namespace std;
/*
Add Comment Here
*/

vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        
       int nums[100];
       for(auto a: nums)
       {
        nums[a]++;

       }

}
int main(void)
{
    vector<int> arr = {8,1,2,2,3};

    auto t= smallerNumbersThanCurrent(arr);
    for(int a: t)
    {
        cout<<a<<" ";
    }
  return 0;
}