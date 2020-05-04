#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  
  int n;
  cin>>n;
  int a=0,b=1,c,x=0;
  while(n>=0){
  if(n==0)
    //cout<<a;
    x=a;
  else if (n==1)
    //cout<<b;
    x=b;
  else
  {
    c=a+b;
  a=b;
  b=c;
  }
  n--;
  }
  cout<<x;
  }