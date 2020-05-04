#include<iostream>
using namespace std;
int main()
{
  int s,t , a,c;
  cin>>t>>a>>c;
  s= a*75 + c*30;
  if (s <= t)
  	cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}