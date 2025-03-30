#include <iostream>
#include <bits/stdc++.h>
using namespace std;

/* given three sorted array find three elements a,b,c, such that
min|max(a,b,c)- min(a,b,c)|

*/

int maxThree(int a, int b, int c)
{
    if(a>=b && a>=c){return a;}
    else if(b>=a && b>=c){return b;}
    else{return c;}
}

int minThree(int a, int b, int c)
{
    if(a<=b && a<=c){return a;}
    else if(b<=a && b<=c){return b;}
    else{return c;}
}

int getMinDiff(vector<int> a, vector<int> b, vector<int> c>
{

}
int main(void)
{
    cout<<minThree(2,2,-1);
  return 0;
}