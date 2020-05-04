import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt(),a=9,b=11,c;
      //Float a=95.0f,x=20.5f;
      for(int i=0;i<n;i++)
      {if(i==0)
        System.out.print(9+" ");
       else if(i==1)
System.out.print(11+" ");
         else
         {c=a+b;
       a=b;b=c;
           System.out.print(c+" ");
         }
      	
      }
	}
}