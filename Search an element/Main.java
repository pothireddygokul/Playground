import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];//,b[]=new int[n];
    
    for(int i=0;i<n;i++)
      a[i]=s.nextInt();
      int k=s.nextInt();
      for(int i=0;i<n;i++)
        if(a[i]==k)
        { System.out.print(k+" is present in the array");
        return;
        }
     System.out.print(k+" is not present in the array");
  
    }
}