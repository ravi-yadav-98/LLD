#include <iostream>
#include <bits/stdc++.h>
using namespace std;
// storage classess in c
/*
Moreover, a variable’s storage class tells us: 
(a) Where the variable would be stored. 
(b) What will be the initial value of the variable, if initial value is 
not specifically assigned.(i.e. the default initial value). 
(c) What is the scope of the variable; i.e. in which functions the 
value of the variable would be available. 
(d) What is the life of the variable; i.e. how long would the 
variable exist.

There are four storage classes in C: 
(a) Automatic storage class 
(b) Register storage class --> accessed faster 
(c) Static storage class 
(d) External storage class

C++ uses 5 storage classes, namely: 

auto
register
extern
static
mutable

*/

int main(void)
{
    auto i=32;
    cout<<sizeof(i);
  return 0;
}