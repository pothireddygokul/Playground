import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      String a=s.nextLine(),b=s.nextLine();
      int n1=a.length(),n2=b.length();
      //if(n1!=n2)
      
      char a1[]= a.toCharArray(),b1[]=b.toCharArray();
      for(int i=0;i<n1/2;i++)
        if(a1[i]!=b1[n1-i-1])
        {
          System.out.print("It is not same");
	return;
        }
    System.out.print("It is same");
}}