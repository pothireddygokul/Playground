 import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      String a=s.next(),b="a e i o u";
      char c[]= a.toCharArray(),t, d[]=new char[200];

      int x=0,e[]=new int[200];
for(int i=0;i<a.length();i++)
{d[i]='_';e[i]=1;}
      
      for(int i=0;i<a.length()-1;i++)
        for(int j=i+1;j<a.length();j++)
          if(c[i]>c[j]){
            t=c[i];c[i]=c[j];c[j]=t;}
      
      for(int i=0;i<a.length();i++)
      { int f=0;
       for(int j=i+1;j<a.length();j++)
       {
           if (c[i]==c[j] && (c[i]!='_' ))
        {
             c[j]='_';
            d[x]=c[i];e[x]++;
        x++;
        f=1;
           }
         
         
       }  
       if(f!=1){
         d[x]=c[i];x++;}
      }
      for(int i=0;i<x;i++)
        if(d[i]!='_')
        System.out.println(d[i]+""+e[i]) ;
      
    }
}