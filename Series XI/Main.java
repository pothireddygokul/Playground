import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      Float a=95.0f,x=20.5f;
      for(int i=0;i<n;i++)
      {
        System.out.print(a+" ");
      	a+=x;
        x+=2.0f;
      }
	}
}