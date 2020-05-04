#include<iostream>
#include<cctype>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  int v=0,c=0,w=0,d=0,s1=0;
  getline(cin,s);
  for(int i=0;i<s.length();i++)
  {
    if (s[i]==' ')
      w++;
    else if (isdigit(s[i]))
      d++;
    else if (isalpha(s[i]))
      if (s[i]=='a' || s[i]=='e' || s[i]=='i' ||s[i]=='o' || s[i]=='u' || s[i]=='A' || s[i]=='E' ||s[i]=='I' || s[i]=='O' ||s[i]=='U' )
  		v++;
    	else
          c++;
    else
      s1++;
      }
  
  cout<<"Vowels:"<<v;
   cout<<"\nConsonants:"<<c;
   cout<<"\nWhite Spaces:"<<w;
   cout<<"\nDigits:"<<d;
   cout<<"\nSymbols:"<<s1;
}