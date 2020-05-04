import java.util.*;
class Main
{
  public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
    int n=s.nextInt(),s1=0;
    int a[]=new int[n];//,b[]=new int[n];
    
    for(int i=0;i<n;i++)
      a[i]=s.nextInt();
    
     // int k=s.nextInt();
      for(int i=0;i<n-1;i++)
      {
       
          if(a[i]!=a[i+1])
            s1++;
          
       
        }
    System.out.println(s1);
  }
}