#include<iostream>
using namespace std;
#include<cctype>
int main()
{
  //Type your code here.
  string s;
  cin>>s;
  for(int i=0;i<s.length();i++)
    if(isalpha(s[i]))
      cout<<s[i];
  
}