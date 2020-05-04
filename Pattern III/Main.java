#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s=0,c=1,x=1;
  cin>>n;
  int j;
 	for(int i=1;i<=n;i++)
 {
      for(int j=1;j<=i;j++)
      {
        if (j==i)
          cout<<i;
        else
          cout<<i<<"*";
      }cout<<"\n";
  
    }
   
  for(int i=n;i>=1;i--)
 {
      for(int j=1;j<=i;j++)
      {
        if (j==i)
          cout<<i;
        else
          cout<<i<<"*";
      }cout<<"\n";
  
    }
}