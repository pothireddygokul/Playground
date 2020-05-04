import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
     String a=s.nextLine();
      if(a.length()<3) 
      {
    
        System.out.println("Not a Trendy Number");
        return;
      }
       char x=a.charAt(1);
      int z=(int)x-48;
      
      if(a.length()==3 && x%3==0)
        System.out.println("Trendy Number");
      else
        System.out.println("Not a Trendy Number");
        
    }
}