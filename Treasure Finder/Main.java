#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  
  int a,b,c,x,y=1;
  cin>>a>>b>>c;
  
  if( (a>b && a<c ) or (a>c and a<b))
    x =a;
  else if( (b>a && b<c) or (b>c and b<a))
    x = b;
    else if( (c > a && c<b)or (c>b and c<a))
      x = c;
  cout<< "The treasure is in box which has number "<<x<<"\n";
  if ((b%a == 0) && (c%a==0))
    y = a;
  else if ((a%b == 0) && (c%b==0))
    y = b;
  else if ((a%c == 0) && (b%c==0))
    y = c;
  cout<<"The code to open the box is "<<y;
}