#include<iostream>
using namespace std;
int main()
{
  
  int n;
  float t;
  cin>>n>>t;
  if (n==2)
    cout<<t+t/2;
  else if (n==3)
    cout<<t*2;
  else if (n>3)
    cout<<"Number of items is more";
	else
      cout<<t;
}