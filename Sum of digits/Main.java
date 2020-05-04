import java.util.Scanner;
class Main
{     static int sum=0,rem=0;
      
    public static void main(String args[])
    {
         Scanner s=new Scanner(System.in);
      int n=s.nextInt();

      int r=fun(n);
      System.out.print("The sum of digits in "+n+" is "+r);
    }
  static int fun(int n)
  {
    if(n<10)
    	return n+sum;
    else
    {
      rem=n%10;
      sum=sum+rem;
      n=n/10;
       return fun(n);
    
      }
    
    }
}
