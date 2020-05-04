#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p;
  float t;
  cin>>p>>t;
  if(t>13.30)
    if( p <= 13)
      cout<<"$"<<2<<".00";
  	else
    cout<<"$"<<5<<".00";
  else
    if( p <= 13)
      cout<<"$"<<4<<".00";
  else
    cout<<"$"<<8<<".00";
  
}