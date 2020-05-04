#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  
  int n,m,t,f=0,c=1;
  cin>>n>>m>>t;
  for (int i=1 ;i<=n;i++){
    for(int j = 1 ;j<=n;j++)
    {
      if (f!=0)break;
      if (i == 1 || j == m || j == 1 )//&& f == 0)
      {
        if (c == t)
        {f =1;
        break;}
      c+=1;
    }
      
}
  
}
  if (f==1)
    cout<<"Yes";
  else
    cout<<"No";
}