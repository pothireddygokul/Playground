import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      
      int m=s.nextInt(),n=s.nextInt(),x,y,s1,s2;
      for(int i=m;i<=n;i++)
      {
        x=i/10;
        y=i-x*10;
        s1=x+y;s2=x*y;
        if((s1+s2)==i)
          System.out.println(i);
      
        
      }
      
    }
}