import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      Float c=0f;
      int i=0;
    // for(i=0;i<3;i++)
      while(true)
      {
       if(i==3)
         break;
      int   n=s.nextInt();
        
        if(n<=0)
        {
          c--;
          
          break;
        }
        //else if(n=
        else 
        {
          if(n%2!=0)
          {c++;i++;}
          else
            c=c-0.5f;
        } 
      }
      System.out.printf("%.2f",c);
    }
}