import java.util.*;
class Customer
{
  
 void name(String na)
 {
 System.out.println(na);
 }
  void address(String ad)
  {   System.out.println(ad);
  }
  void co(String cn)
  {  System.out.println(cn);
  }
  void email(String em)
  {  System.out.println(em);
  }void prooft(String pt)
  { System.out.println(pt);
  }void proofi(String pi)
  { System.out.println(pi);
  } 
}
  class Main
{
  public static void main(String args[])
  {
    String  na,ad,nu,em,pt,pi;
      Scanner s=new Scanner(System.in);
 	Customer c=new Customer();
    na=s.nextLine();ad=s.nextLine();nu=s.nextLine();em=s.nextLine();pt=s.nextLine();pi=s.nextLine();
        System.out.println("Registration");
    System.out.println("Enter your name\nEnter your address\nContact Number\nE-Mail ID\nEnter proof type");
System.out.println("Enter proof id\nCustomer Details");
    c.name(na);
    c.address(ad);
	c.co(nu);
    c.email(em);
    c.prooft(pt);
    c.proofi(pi);
    System.out.println("Thank you for registering. Your id is 1...");

  	
  }
}