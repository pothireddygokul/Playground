#include<iostream>
using namespace std;

int fun(int n)
 {
  if( (n == 1) || (n==0))
   return 1;
   else{
     return n*fun(n-1);
   }
 }
int main()
{
  int n1 ;
  cin>>n1;
 
  int r = fun(n1);
  cout<<"The factorial of "<<n1<<" is "<<r;
 } 
