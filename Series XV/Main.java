import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt(),a=3,b=8,c=0;
      
      for(int i=0;i<n;i++)
      {
        if(i==0)
          System.out.print(a+" ");
        else if(i==1)
          System.out.print(b+" ");
        else{
          System.out.print((a+b+i)+" ");
        c=a+b+i;
          a=b;
          b=c;
        }
        }
	}
}