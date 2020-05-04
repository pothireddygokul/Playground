#include<iostream>
using namespace std;
int even(int l[100],int n1)
{
 for(int i=0;i<n1;i++)
 if(l[i]%2!=0)
   return 0;
 return 1;
}

int odd(int l[100],int n1)
{
 for(int i=0;i<n1;i++)
 if(l[i]%2==0)
   return 0;
 return 1;
}
int main()
{
  //Type your code here.\\
  
  int n,a[100],e=0,o=0;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>a[i];
 e=even(a,n);
   o=odd(a,n);
  if (e==0 && o==1)
    cout<<"The array is Odd";
  else if (e==1 & o==0)
    cout<<"The array is Even";
 else
   cout<<"The array is Mixed";
  
  
}