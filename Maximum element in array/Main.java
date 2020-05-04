import java.util.Scanner;
import java.lang.*;

class Main
  
{	
  
    public static void main(String args[])
    {
   
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[100];
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      int r=m(n,a);
      System.out.print("Maximum element in the array is "+r);
    }
  static int m(int n,int a[])
  {
    if(n==0)
      return a[0];
    else 
      return Math.max(a[n],m(n-1,a));
  }
}