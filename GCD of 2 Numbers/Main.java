#include<iostream>
#include<stdlib.h>
#include<string.h>
using namespace std;

int fun(int a,int b)

{   
 if (a==0)
   return b;
  else if (b==0)
    return a;
   else if (a==b)
     return a;
  else
    if (a>b)
    return fun(a-b,b);
  else
    return fun(a,b-a);
  
}



int main()
{
    int  a1,b1;
 
    cin>>a1>>b1;
    cout<<"G.C.D of "<<a1<<" and "<<b1<<" = "<<fun(a1,b1);
   
    
}