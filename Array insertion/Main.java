#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
int n,a[100],k,x;
 cout<<"Enter the number of elements in the array\n";
  cin>>n;
cout<<"Enter the elements in the array\n";
  for(int i=1;i<=n;i++)
  cin>>a[i];
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>k;
  
  if(k>n)
    cout<<"Invalid Input\n";
/*  else
  {
  cout<<"Enter the value to insert\n";
  cin>>x;
for(int i=n;i>0;i--)
{
  
  a[i+1]=a[i];
  if(i==k)
  { a[k]=x;
  break;}
}
  n++;
  cout<<"Array after insertion is\n";
for(int i=1;i<=n;i++)
  cout<<a[i]<<"\n";
  }
*/
  else{
    cout<<"Enter the value to insert\n";
  cin>>x;
    cout<<"Array after insertion is\n";
    for(int i=1;i<=n;i++)
    {if (i==k)
      cout<<x<<"\n";
      cout<<a[i]<<"\n";
    }
  }
  
  
  
}