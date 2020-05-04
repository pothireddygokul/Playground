#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  //Type your code here.
  
  
  int fp,fd,fc,sp,sd,sc,ap,ad,ac;
  int f,s,a;
 cin>>fp>>fd>>fc>>sp>>sd>>sc>>ap>>ad>>ac;
  f= fp - fd*fp/100+ fc;
  s = sp-sd*sp/100+sc;
  a = ap-ad*ap/100+ ac;
  //cout<<max_element(f,s,a);
  
  
  cout<<"In Flipkart Rs."<<f<<"\n";
  cout<<"In Snapdeal Rs."<<s<<"\n";
  cout<< "In Amazon Rs."<<a<<"\n";
  
  if ( f<=s && f<=a)
    cout<<"He will prefer Flipkart";
  else if (a<=s && a<=s)
    cout <<"He will prefer Amazon";
  else
    cout<<"He will prefer Snapdeal";
  
}