#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x, c=0,n,s=0;
  cin>>n;
  while(s<n)
  {cin>>x;
    s+=x;
   c++;
  }
cout<<"The number of turns is "<<c;
}