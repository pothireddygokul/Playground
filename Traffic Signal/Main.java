import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      Float a=s.nextFloat(),x;
      int b=s.nextInt(),c=s.nextInt();
      x=a/b;
      if(x>c)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}