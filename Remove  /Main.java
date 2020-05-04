#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  
  string s;
  char x,y,z;
  getline(cin,s);
   
   //for(int i=0,j=1,k=2;k<s.length();i+=3,j+=3,k+=3)
  for(int i=0 ; i<s.length();i++) 
  {
     //x=s[i];y=s[i];z=s[i];
	//if(s[i]=='t' && s[j]=='h' && s[k]=='e')
    if((s[i]=='t' && s[i+1] == 'h' && s[i+2]=='e') || i>s.length()-1)  
    {i+=3;
    }
     else
     cout<<s[i];//<<s[j]<<s[k];
   }
}