import java.util.*;
class Main
{
  public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
    int n=s.nextInt(),m1,m2,s1=0;
    int a[]=new int[25],b[][]=new int[25][2];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    m1=a[0];
    m2=a[0];
    for(int i=1;i<n;i++)
    {
      if(a[i]>=m1)
        m1=a[i];
      if(a[i]<m2)
        m2=a[i];
    }
    System.out.print("The range of the array is "+(m1-m2));
  }
}