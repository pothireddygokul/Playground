import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
			Scanner s=new Scanner(System.in);
      Float a1=350.34f,b1=230.90f,c1=190.55f,d1=125.30f,e1=180.90f;
      int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt(),e=s.nextInt();
	if(15000>(a*a1+b*b1+c*c1+d*d1+e*e1))
      System.out.print("Yes");
     else
       System.out.print("No");
       
    }
}