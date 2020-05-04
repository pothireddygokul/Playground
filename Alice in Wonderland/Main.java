import java.util.Scanner;
class Main
{
	public static void main(String args[])

{
		Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int r=0,sum=0;
  while(a>10)
  {
    r=a%10;
    sum=sum+r;
    a=a/10;
  }
  System.out.println("Alice must go in path-"+(sum+a));
	}
}