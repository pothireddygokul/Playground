import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      String a=s.nextLine();
      Float b=s.nextFloat();
      int c=s.nextInt();
      String l="4 5 6 11 12",x="1 2 3 4 5 6 7 8 9 10 11 12";
     
      //int x=((int)(a))-48;
//      System.out.println(a);
      if (!(x.contains(a)))
      {System.out.println("Invalid Input");
      return;
      }
      if(l.contains (a))
        System.out.println( ((b/5) + b )*c);
      else
        System.out.println( (b)*c);

    }
}