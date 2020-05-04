import java.util.*;
 class Main
 {
   public static void main(String args[])
   {

     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     Float m=0.0f,s1=0.0f;
     int a[]=new int[25];
     for(int i=0;i<n;i++)
     a[i]=s.nextInt();
     
     for(int i=0;i<n;i++)
     {
       s1+=a[i];
     }
     m=s1/n;
     System.out.print("The mean of the array is ");
     System.out.printf("%.2f",m);
   }
 }