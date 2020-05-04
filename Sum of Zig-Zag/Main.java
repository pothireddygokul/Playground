#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  
  int n,m,a[100][100],x=0;
  cin>>n>>m;
  for(int i=1;i<=n;i++)
    for(int j=1;j<=m;j++)
    {
      cin>>a[i][j];
      if(i==1 || i==n || i==j)
        x+=a[i][j];
    }
  cout<< "Sum of Zig-Zag pattern is "<<x;
  
}