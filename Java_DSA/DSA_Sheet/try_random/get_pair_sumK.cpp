#include <iostream>
#include <bits/stdc++.h>
using namespace std;

//get number of pairs which sum K (not unique)
int fact(int n)
{
    if(n==0 || n==1)
    {
        return 1;
    }
    else
    {
        return n*fact(n-1); 
    }
}
int getPairSum(vector<int> arr, int k)
{
    int s =0;
    int e = arr.size()-1;
    int cnt=0;
    while(s<=e)
    {   
        // cout<<cnt<<endl;
        if(arr[s]+arr[e]>k)
        {
            e--;
        }
        else if(arr[s]+arr[e]<k)
        {
            s++;
        }
        else{
          
            if(arr[s] != arr[e])
            {    int c1=0;
                int c2=0;
                int temp1 = arr[s];
                
                int temp2 = arr[e];
            
                while(arr[s] ==temp1)
                {
                    c1++;
                    s++;
                }

                
                while(arr[e] ==temp2)
                {
                    c2++;
                    e--;
                }   
                
                cnt =cnt+(c1*c2);
              
            }       
            else{
            //   cout<<c1<<" "<<c2<<endl;
                cnt = cnt+ (e-s+1);
                s++;
                e--;
            }
        }
    }
    return cnt;
}
int main(void)
{
    vector<int> t1 = {1,2,3,3,4};
    vector<int> t2 = {1,1,4,4,5,5,5,6,6,7,7};
    int k;
    cin>>k;
    cout<<getPairSum(t2,k);   //should return 2


    // cout<<fact(4);
  return 0;
}