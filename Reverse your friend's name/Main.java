#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
//Type your code here
  
  string s;
  getline(cin,s);
  int n=s.length()-1;
  for(int i=0;i<s.length()/2;i++)
  {swap(s[i],s[n]); n--;}
  cout<<s;
    
}