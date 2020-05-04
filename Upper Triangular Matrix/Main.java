import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[][]=new int[100][100];
      for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
          a[i][j]=s.nextInt();
      
      for(int i=0 ;i<n; i++)
        for(int j=0 ;j<n; j++)
        if (i<=j)
          continue;
      else if(a[i][j]!=0)
      {System.out.print("no");
       return;
      }
      System.out.print("yes");
      
	}
}