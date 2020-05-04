#include<iostream>
using namespace std;
int main()
{
  int a,c=0,s=121,x=32;
  //float s=0.5;
  cin>>a;
  for(int i=0;c<a;i=i+1)
    //if(i%3==0)
    { cout<<s<<" ";
     s+=104+x*i;
    c++;
    }
  
}