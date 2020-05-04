#include<iostream>
using namespace std ;

int fun(int x,int y)
{
  if (y == 0)
    return 1;
  else if (y ==1)
    return x;
  else
    return x*fun(x,y-1);
}
int main()
{
  int a,n;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
  int x = fun(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<x;
  
}