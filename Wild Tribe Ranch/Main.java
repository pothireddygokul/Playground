#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x>>y;
  if (x<y)
    cout<<"Sorry, you can't enter";
  else if (x>y)
    cout<<"Yes, you can enter.";
  else
    cout<<"Yes, you can enter. Kindly use a rope.";
}