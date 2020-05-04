#include<iostream>
using namespace std;

int fun(int n)
 {
  if(n == 0) // (n==0))
   return 0;
  else if(n == 1)
     return 1;
   else{
     return fun(n-2)+fun(n-1);
   }
 }
int main()
{
  int n1 ;
  cin>>n1;
 
  int r = fun(n1-1);
  //for(int i =0 ; i<=n1 ;i++)
   // cout<<fun(i);
  cout<<"The term "<<n1<<" in the fibonacci series is "<<r;
 } 