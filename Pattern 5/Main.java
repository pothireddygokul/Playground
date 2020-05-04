import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int a=s.nextInt(),x=1;
      for(int i=1;i<=a;i++)
      {
        for(int j=1;j<=i;j++)
        {
          System.out.print(x+" ");
          x++;
        }
        System.out.print("\n");
      }
	}
}