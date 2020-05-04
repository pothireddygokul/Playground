import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int n=s.nextInt(),n1=n,x=0,z=1;
      if(n==1)
      {
        System.out.println(n+"\n"+0);
        return;
      }
        System.out.println(n);
      
        //for(int i=1;i<=n1;i++)
      while(n>0)
      {
       
          
            if(n==1)
           {  
             System.out.println(x);
             break;
           }
           else if(n%2==0)
        {
             n/=2;
             x++;
          System.out.println(n);
           
            }
            
        else 
        {n=3*n+1;
         x++;
           System.out.println(n);
         
         
          
        }
         }
      // System.out.println(n1);
    }
}