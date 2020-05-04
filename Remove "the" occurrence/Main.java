import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
      String a=s.nextLine();
      String x= a.replace("the ","_");
	char l[]=x.toCharArray();
      for(int i=0;i<x.length();i++)
      {   String z=Character.toString(l[i]);
        if (!( z.equals("_")))
        System.out.print( l[i] );
       else
         System.out.print("");
      }
    }
}