#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s=0,c;
  cin>>n;
  for(int i=1;c<n;i++)
  {
    if(i%2!=0)
      s=i*i-1;
    else
      s=i*i-2;
    cout<<s<<" ";
    c++;
  }
  
}