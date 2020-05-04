#include<iostream>
using namespace std;
int fun(int x,int y)
{
  if (y==0 )
    return 1;
  return x*fun(x,y-1);
}

int main()
{
  int m,n,a,x;
  cin>>m>>n>>a;
  x=fun(m,n);
 //cout<<x; 
  if(x>=a)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}