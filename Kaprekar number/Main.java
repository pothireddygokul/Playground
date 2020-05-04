#include<iostream>
#include<sstream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
 string s,s1,s2;
  stringstream ss;
  cin>>s;
  
  int i,x=-1,a,b,sum=0;
    x=stoi(s);
  if (x<=5)
    cout<<"Not a Kaprekar Number";
  else{
    a=x*x;
    ss<<a;
    ss>>s;
   
        for(i=s.length()/2;i<s.length();i++)
                s2+=s[i];
            for (i=0;i<s.length()/2;i++)
                s1+=s[i];
            sum=stoi(s2)+stoi(s1);
   
    if(sum==x)
      cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
  }
}