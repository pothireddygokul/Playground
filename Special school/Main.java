#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string a,b;
  cin>>a>>b;
  int n=a.length()-1,f=0;
  for(int i=0;i<a.length();i++)
  { if(a[i]!=b[n])
    {f=1;break;}
  n--;}
if(f==0)
  cout<<"It is correct";
  else
    cout<<"It is wrong";
}