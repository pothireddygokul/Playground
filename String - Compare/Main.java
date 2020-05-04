import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		
      Scanner s=new Scanner(System.in);
      String a=s.nextLine(),b=s.nextLine();
      if(a.equals(b))
        System.out.print("Strings are same");
      else
        System.out.print("Strings are not same");
      
    }
	}