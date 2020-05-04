import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
Scanner s=new Scanner(System.in);
      int a=s.nextInt();Float b=s.nextFloat();
      if(a>3)
      { System.out.print("Number of items is more");
      return;
      }
       if(a==1)
        System.out.print(b);
      else if(a==2)
        System.out.print( (b/2 +b ));
       else 
         System.out.print((b*2));
    }
}