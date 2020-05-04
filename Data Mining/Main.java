import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
          Scanner s=new Scanner(System.in);
      String a=s.nextLine();
      int n=a.length(),s1=0,s2=0;
      for(int i=0;i<n;i++)
      {
        char z=a.charAt(i);
        int x=(int)z-48;
        if(x%2==0)
          s1+=x;
          else 
            s2+=x;
      }
      if(s1==s2)
        System.out.println("yes");
        else
          System.out.println("No");
 	  
    }
}