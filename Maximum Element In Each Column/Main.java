import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
    int m=s.nextInt(),n=s.nextInt(),ma,s1=0;
    int a[][]=new int[100][100],b[]=new int[100];
    
      for(int i=0;i<m;i++)
    	for(int j=0;j<n;j++)
      		a[i][j]=s.nextInt();
 
      
      
for(int j=0;j<n;j++)
{ma=a[0][j];
      for(int i=0;i<m;i++)
      {            if(a[i][j]>ma)
            ma=a[i][j];
        
       
      }System.out.println(ma);}
	}
}