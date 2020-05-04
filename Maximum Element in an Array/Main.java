import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt(),m;
      int[] a=new int[n];
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      m=a[0];
      for(int i=1;i<n;i++)
        if(m<a[i])
          m=a[i];
        System.out.print(m+" is the maximum element in the array");
      
      
    }
}