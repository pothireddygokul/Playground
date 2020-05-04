#include <iostream>
#include<bits/stdc++.h>
using  namespace std;
int main()
{
//char str[100], rev[100];     
string str,rev;
  int count = 0, end, i;    
//Your code goes here 
getline(cin,str);
  //rev=strrev(str);
  //
  i=0;
  //while(str[i]!='\0')
  //{count++;
  //  i++;
  //}
  count= str.length();
  end=count-1;
  for(int i=0;i<=count/2;i++)
  {swap(str[i],str[end]);
  end--;}

//  rev = reverse(str.begin(),str.end());
cout<< str;
}