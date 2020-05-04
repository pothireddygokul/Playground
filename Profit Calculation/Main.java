import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner s=new Scanner (System.in);
      int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
      System.out.print("The profit obtained is Rs."+ (a*b - (a*c )-100));
	}
}