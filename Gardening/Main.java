#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m ,r,c=1,f=0;
  cin>>n>>m>>r;
  for(int i =1 ; i<=n;i++)
  {   for (int j = 1 ;j<=m ; j++)
    {
      if ((i == 2 || i == (n-1) ) and (c== r ))
      { 
        f = 1;
  		break;
      }
     // cout<<c<<"\t";
  	c++;
    } //cout<<"\n";  
}
  if (f == 1)
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}