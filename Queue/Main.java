#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,k,a[100];
  cin>>n>>k;
  for(int i=0;i<n;i++)
    cin>>a[i];
  if (k>n)
    cout<<n;
else
  cout<<k;
}