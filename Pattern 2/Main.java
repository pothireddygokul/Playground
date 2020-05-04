import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int a=s.nextInt(),x=0,c=0;
   for(int i=1;i<=a;i++  )
   {
     
     for(int j=1;j<=i;j++)
     {
       if(j%i!=0)
         
         if(c%2!=0)
         
         {System.out.print(1+" ");
         c++;}
       else
                  {System.out.print(0+" ");
         c++;}
       else
         if(c%2!=0)
         
         {System.out.print(1+" ");
         c++;}
       else
                {System.out.print(0+" ");
         c++;}
         
      }

       System.out.print("\n");
   }
	}
}