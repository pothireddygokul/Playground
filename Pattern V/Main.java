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
      x=n*2-2*i+1;
      
      for(int j=1;j<i;j++)
        cout<<"--";
      for(int j=0;j<=x;j++)
      {
        if(j<=x/2)
        {
          cout<<c<<"*";
        	
        }else if(j==x)
          cout<<c-x/2-1+(x/2+1)*(x/2+1);
          else
 	      cout<<c-x/2-1+(x/2+1)*(x/2+1)<<"*";
            //cout<<x/2<<"*";
      c++;
      }
      c-=x/2+1;
      cout<<"\n";  
   } 
}