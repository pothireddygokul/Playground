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
  if(i%2!=0)
  for(int j=1;j<=i;j++)
  {
       if (j==i)
       	 	cout<<c;
       else
       	 	cout<<c<<"*";
      c++;
  }
  else    
  {
    x=c;
    c=x+i;
    //cout<<1;
        for(int j=x+i-1;j>=x;j--)
  			{//cout<<1;
             if (j==x)
             	 cout<<j;
             else
              	cout<<j<<"*";
            //x--;
            }
      
  }   
      cout<<"\n";
  }
   
}