import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int a=s.nextInt(),x=0;
      for(int i=a;i>=1;i--)
      {
        //x=(a-i+1);
        for(int j=1;j<=a;j++)
        {
          if(j>=a-i+1)
            System.out.print(a);
          //else if(j==1) 
           // System.out.print(a-i+1);
          else
            System.out.print(i+j-1);
          //   x+=1;
        }
        System.out.print("\n");
        
      }
	}
}