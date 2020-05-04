#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,c=3;
  float s=0.0;
  while(c!=0)
  {
    cin>>x;
    if(x<0){
      s--;
      break;}
    
    if (x%2==0)
      s-=0.5;
    else
    {s++;
     c--;
    }
  }
  cout<<s;
  
}