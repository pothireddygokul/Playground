import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      String l=s.nextLine();
      for(int i=l.length()-1;i>=0;i--)
      System.out.print( l.charAt(i));
	}
}