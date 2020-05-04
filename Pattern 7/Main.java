import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
      int a=s.nextInt(),x=0;
   for(int i=1;i<=a;i++  )
   {
     
     for(int j=1;j<=i;j++)
     {
       if(j%2==0)
         System.out.print(0+" ");
       else
         System.out.print(1+" ");
         
      }

       System.out.print("\n");
   }
	}
}