#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  cin>>s;
  int x =0;
	x = int(s[0]) + int(s[s.length()-1])-48-48;
  cout<<x;

}
