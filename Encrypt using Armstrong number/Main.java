#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int f=0,c=0,x,r;
  x=n;
  while(n!=0)
  {
    r=n%10;
    n=n/10;
    c++;
  }
  
  n=x;
  int s=0;
  while(n!=0)
  {
    r=n%10;
    n=n/10;
    s+=power(r,c);
  }
  if(s==x)
    return 1;
  else
    return 0;
  
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}