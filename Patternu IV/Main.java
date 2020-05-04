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
     if (i%2!=0) 
      for(int j=1;j<=n;j++)
      {
        if (j==n)
          cout<<i+1;
        else
          cout<<i;
      }
  else
     for(int j=1;j<=n;j++)
      {
        if (j==1)
          cout<<i+1;
        else
          cout<<i;
     }
      cout<<"\n";
    
      
      
   }
   
  
}