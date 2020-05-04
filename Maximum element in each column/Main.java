#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,a[100][100],x=-1;
  
  cin>>n>>m;
  for(int i=1;i<=n;i++)
    for(int j=1;j<=m;j++)
    cin>>a[i][j];
  
  int b[100][100];
  for(int i=1;i<=m;i++)
  { for(int j=1;j<=n;j++)
  {
    b[i][j]=a[j][i];
    //cout<<a[j][i]<<" ";
  	if (a[j][i]>x) x=a[j][i];
  }
  cout<<x<<"\n";
  x=-1;
}
  
}