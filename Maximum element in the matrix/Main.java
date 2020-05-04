
  #include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,a[100][100],x=-1;
  
  cin>>n>>m;
  for(int i=1;i<=m;i++)
    for(int j=1;j<=n;j++)
    cin>>a[i][j];
 
  for(int i=1;i<=m;i++)
    for(int j=1;j<=n;j++)
      if (a[i][j]>x)
        x=a[i][j];
  cout<<"The maximum element is " <<x;
  
}