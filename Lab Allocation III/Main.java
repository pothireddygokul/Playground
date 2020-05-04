import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int x=0,a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt();
      if(a>=d)
        x++;
      if (b>=d)
        x++;
       if (c>=d)
        x++;
	System.out.print(x);

    }
}