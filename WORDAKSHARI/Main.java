#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  
  string s;
  char x;
  cin>>s;
  x=s.back();
  while(1)
  {
    cout<<s<<"\n";
    cin>>s;
    if(x!=s.front())
      break;
    x=s.back();
   
    
    
    
  }
}