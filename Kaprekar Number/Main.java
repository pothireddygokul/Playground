import java.util.Scanner;
import java.lang.Math.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int k=s.nextInt();
      double n=(Integer.toString(k)).length(),p=10,z=Math.pow(p,n);
      int o=(int)z;
      
      int x= (k*k),y,sum;
      y=x/o;
      sum= y+(x-y*o);
      if(sum==k)
        System.out.print("Kaprekar Number");
      else
        System.out.print("Not a Kaprekar Number");
      
      
    }
}