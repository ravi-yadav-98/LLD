#include <iostream>
#include <bits/stdc++.h>
#define MAX 10
#define HELLO cout<<"Hello Ravi"<<" ";
#define FUN(n) (n*n)
using namespace std;

/*
Macro:
define MAX 40;
*/
int main(void)
{
    for(int i=1;i<MAX;i++)
    {
        HELLO;
        cout<<FUN(i)<<" ";
        // cout<<i<<endl;
    }
  return 0; 
}