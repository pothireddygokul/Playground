import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int a=s.nextInt(),c=0,x=0;
      while(true)
      {
        int n=s.nextInt();
        c++;
        x+=n;
        if(x>=a)
          break;
      }
      System.out.println("The number of turns is "+c);
    }
}