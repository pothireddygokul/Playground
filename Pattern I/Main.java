#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s=0,c=1;
  cin>>n;
  int j;
 for(int i=n;i<=n+3;i++)
 {
   j=0;
   //for(int j=1;j<=n+1-n;j++)
   while(j<c) 
   {
     cout<<i;
   	j++;
   }
   c++;
   cout<<"\n";
  }
   for(int i=n+3;i>=n;i--)
 {
   j=1;
   //for(int j=1;j<=n+1-n;j++)
   while(j<c) 
   {
     cout<<i;
   	j++;
   }
   c--;
    if (i==n)
      break;
   cout<<"\n";
  }
}