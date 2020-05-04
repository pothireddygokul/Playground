import java.util.Scanner;
import java.lang.Math.*;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      //int n=5;
      
      int y=n/2;
      //double y=Math.ceil(o);
      for(int i=0;i<y+1;i++)
      {
        for(int j=0;j<n;j++)
        {
             
          if(j==i || j==n-i-1)
           {
              
            if(i==y)
            {
            System.out.print("*");
            break;
                
            }
             System.out.print("*");
           }
            
          else
			System.out.print(" ");
          
        }
        System.out.print("\n");
      }
       for(int i=y-1;i>=0;i--)
      {
        for(int j=0;j<n;j++)
        {
             
          if(j==i || j==n-i-1)
           {
              
            if(i==y)
            {
            System.out.print("*");
            break;
                
            }
             System.out.print("*");
           }
            
          else
			System.out.print(" ");
          
        }
        System.out.print("\n");
      }
	}
}