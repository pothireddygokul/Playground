import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int a=s.nextInt(),x=1,b=s.nextInt(),c=s.nextInt();
      for(int i=1;i<=b;i++)
      { for(int j=1;j<=a;j++)
        {
          if(i==1 || j==1 || i==a)
          {
            if(c==x)
            {
              System.out.print("yes");
               return;
            }
           x++;
          continue;
          }
        x++;
            
        }
             }
    	        System.out.println("No");
    }
}