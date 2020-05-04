import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
           Scanner s=new Scanner(System.in);
      
      int a=s.nextInt(),x,y,s1=0,s2=0;
      while(a>0 )
      {
        int b=s.nextInt();
        if(b>=0)
          s1++;
        else
          s2++;
        a--;
      }
      System.out.println("Number of positive numbers is "+s1+" and the number of negative numbers is "+s2);
      
    }
}