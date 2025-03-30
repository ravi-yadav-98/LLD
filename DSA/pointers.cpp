#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main(void)
{
    // int i=3;
    // int* j = &i;  //pointer variable--> to store address of int
    // cout<<"Memory Address  of i : "<<j<<endl;
    // cout<<"Value of i : "<<i<<endl;
    // cout<<"Value at address: "<<*j<<endl;
    // cout<<"Memory Address  of j : "<<&j<<endl;

    //Pointer for different data types:
    // int j =2;
    // float f =2.3;
    // char ch ='A';
    // int *i = &j;
    // char *c = &ch; 
    // float *k = &f;
    // cout<<"Memory Address  of j : "<<i<<endl;
    // cout<<"Memory Address  of f : "<<k<<endl;
    // cout<<"Memory Address  of ch : "<<c<<endl;

    //Note: addresses are always whole number


    //Pointer to a Pointer: stores address of pointer variable
    int i=3; //normal int variable
    int *j;  //integer pointer
    int **k; //pointer to int pointer
    j = &i;
    k = &j;
    cout<<"Memory Address  of i : "<<&i<<endl;
    cout<<"Memory Address  of i : "<<j<<endl;
    cout<<"Memory Address  of i : "<<*k<<endl;
    cout<<""<<endl;
    cout<<"Memory Address  of j : "<<&j<<endl;
    cout<<"Memory Address  of j : "<<k<<endl;
    cout<<""<<endl;
    cout<<"Memory Address  of k : "<<&k<<endl;
    cout<<""<<endl;
    cout<<"Value of j : "<<j<<endl;
    cout<<" "<<endl;
    cout<<"Value of k : "<<k<<endl;
    cout<<" "<<endl;
    cout<<"Value of i : "<<i<<endl;
    cout<<"Value of i : "<<*(&i)<<endl;
    cout<<"Value of i : "<<*j<<endl;
    cout<<"Value of i : "<<**k<<endl;








    return 0;
}