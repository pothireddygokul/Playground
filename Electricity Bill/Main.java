#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n ,c;
  cin>>n;
  if(n<=200)
    c = 0.5 * n;
  else if (n<=400)
    c = 0.65*n + 100;
  else if (n<=600)
    c = 0.80*n + 200;
  else 
    c = 1.25*n + 425;
  cout<<"Rs."<<c;
}