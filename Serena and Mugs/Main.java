#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a[100],k,s=0;
  cin>>n>>k;
  for(int i=0;i<n;i++)
  {cin>>a[i];
   s+=a[i];
  }
if (s<=k)
  cout<<"YES";
  else
    cout<<"NO";
}