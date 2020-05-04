import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
      String a=s.next(),b="a e i o u";
      char c[]= a.toCharArray(),d[]=new char[200];
      int x=0;
      for(int i=0;i<a.length();i++)
      {
        if (!(b.contains(Character.toString(c[i]))))
        {
            d[x]=c[i];
        x++;
        }
      }
      for(int i=0;i<x;i++)
        System.out.print(d[i]) ;
      
    }
}