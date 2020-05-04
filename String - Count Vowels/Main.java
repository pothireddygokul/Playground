import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      String a=s.nextLine(),l="a e i o u" ;
      int c=0;
      for(int i=0;i<a.length();i++)
      {
        if(l.contains(Character.toString((a.charAt(i)))))
          c++;
      }
      System.out.println(c);
	}
}