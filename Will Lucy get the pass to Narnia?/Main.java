#include<iostream>
using namespace std;
int main()
{
    int x,y,o,a;
  cout<<"Enter first number : Enter second number : Menu \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  cin>>x>>y>>o;
    switch(o)
    {
        case 1 : a=x+y;cout<<a;        break;
        case 2 :  a=x-y;cout<<a;
        break;
        case 3 :  a=x*y;cout<<a;
        break;
      case 4 : a=x/y;cout<<a;break;
        case 5 :  a=x%y;cout<<a;
        break;
        default : cout<<"Invalid operation";break;
    }
}