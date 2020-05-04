#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,o=0,e=0;
  string s;
  cin>>s;
  for(int i=0;i<s.length();i++)
  {if(i%2==0)
    o+=int(s[i])-48;
   else
     e+=int(s[i])-48;
  }
  if(o==e)
    cout<<"Yes";
  else
    cout<<"No";
}