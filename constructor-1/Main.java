import java.util.*;
class Shape
{
  Float p=3.14f;
  Float ar;
  public Shape(){}
  public Shape(int l,int b,int h)
  { 
    int ar1=l*b*h;
    System.out.println("Area of Cube is "+ar1);
  }
   public Shape(int r)
  {
     Float f=4/3f;
    ar=f*p*r*r;
    System.out.println("Area of Sphere is "+ar);
  }
  public Shape(int r,int h)
  {
    ar=p*r*r*h;
    System.out.println("Area of Cylinders is "+ar);
  }
 }
  
  
class Main
{
  public static void main(String args[])
  {
	int ch,l,b,h,r;
    Scanner s=new Scanner(System.in);
    
    ch=s.nextInt();//
    System.out.println("1.Cube\n2.Sphere\n3.Cylinder\nEnter the choice");
   
    switch(ch)
    {
      case 1:
        System.out.println("length\nbreadth\nheight");
          l=s.nextInt();b=s.nextInt();h=s.nextInt();
         Shape o=new Shape(l,b,h);
        break;
      case 2:
           System.out.println("radius");
        r=s.nextInt();
         Shape o1=new Shape(r);
        break;
      case 3:
           System.out.println("radius\nheight");
        r=s.nextInt();h=s.nextInt();
         Shape o2=new Shape(r,h);
        
    }
    
  }
}