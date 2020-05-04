#include<iostream>
#include<stdlib.h>
#include<string.h>
using namespace std;

int fun(int n)

{   if (n%10 == n)
    return n;
    else
    return n%10 + fun(n/10);
    
}
int f(int x)
{
  if (x == fun(x))
    return x;
   
     int y = fun(x);
     return fun(y);
}


int main()
{
    int  a1;
 
    cin>>a1;
    cout<<f(a1);
   
    
}