#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  
  int n,a[100],e=0,o=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
      e+=a[i];
    else
      o+=a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<e;
  cout<<"\nThe sum of the odd numbers in the array is "<<o;
}