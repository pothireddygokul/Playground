import java.util.Scanner;
class Main
{

  
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
      int n=s.nextInt(),a[] =new int[100];
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
     
      int r=sum(n,a);
        System.out.print("The sum of the elements in the array is "+r);
    }
   static int sum(int n,int a[])
  {
    if(n==0)
      return a[0];
    else
      return a[n]+sum(n-1,a);
    
  }
  
}