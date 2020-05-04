import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		    Scanner s=new Scanner(System.in);
      String a=s.nextLine(),x="front",y="rear";
      int b=s.nextInt();
      if( a.equals(x))
        if(b==1)
          System.out.println("Left Handed");
      	else
        	System.out.println("Right Handed");
      else
        if(b==1)
          System.out.println("Right Handed");
      	else
        	System.out.println("Left Handed");
        
	}
}