import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       
           Scanner s=new Scanner(System.in);
      
      int a=s.nextInt(),b=s.nextInt(),x,y,s1=0,s2=0;
     for(int i=1;i<=b;i++)
     {
       System.out.println(i+"*"+a+"="+(i*a));
     }
    }
}