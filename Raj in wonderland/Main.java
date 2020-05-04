#include<iostream>
using namespace std;
int main()
{
  int x;
  cin>>x;
  string s;
  s=(x%2==0)?"Possible":"Not possible";
  cout<<s;
}