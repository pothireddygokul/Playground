import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        
         Scanner s=new Scanner(System.in);
      int n=s.nextInt();

      int r=fun(n);
      System.out.print("The number of digits in "+n+" is "+r);
    }
  static int fun(int n)
  {
    if (n<10)
      return 1;
    else
    {
     return 1+fun(n/10);
    }
     
  }
}