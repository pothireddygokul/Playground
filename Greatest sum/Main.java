#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  
  int n,m,a[100][100],x=0,y=0,z=0,x1=0,y1=0,z1=0;
  cin>>n>>m;
  for(int i=1;i<=n;i++)
    for(int j=1;j<=m;j++)
      cin>>a[i][j];
  cout<<"Sum of rows is ";
  for(int i=1;i<=n;i++)
  {for(int j=1;j<=m;j++)
    {
      x+=a[i][j];
    }
   if (x>y)
   { y=x;
   z=i;
   }
   cout<<x<<" ";
   x=0;
  }
  
  cout<<"\nRow "<<z<<" has maximum sum";
  y=0;
  cout<<"\nSum of columns is ";
  for(int i=1;i<=m;i++)
  {for(int j=1;j<=n;j++)
		  x+=a[j][i];
   if (x>y)
   {y=x;z=i;}
   cout<<x<<" ";
   x=0;
  }
  cout<<"\nColumn "<<z<<" has maximum sum";
  
}