#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  cin>>s;
  int a=0,x;
  for(int i=0 ;i<s.length();i++)
    a+=int(s[i])-48;
  //cout<<a<<' '<<stoi(s);
if( stoi(s)%a==0)
  cout<<"Harshad Number";
 else
   cout<<"Not Harshad Number";
}