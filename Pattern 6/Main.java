import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
      int a=s.nextInt(),x=0;
   for(int i=1;i<=a;i++  )
   {
     
     for(int j=1;j<=i+x;j++)
     {
       //if(i==j)
       //System.out.print(j+" "+(j+1));
       //else
         System.out.print(j+" ");
       
     }
     x+=1;
       System.out.print("\n");
   }
	}
}