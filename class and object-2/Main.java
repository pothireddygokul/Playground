import java.util.*;
class Customer
{
  
 void name(String n,String na)
 {
// System.out.println(n);
  
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
    String  n,na,ad,nu,em,pt,pi;
      Scanner s=new Scanner(System.in);
 	Customer c=new Customer();
n=s.nextLine();    na=s.nextLine();ad=s.nextLine();nu=s.nextLine();em=s.nextLine();pt=s.nextLine();pi=s.nextLine();
       //System.out.println("Enter the number of Customer");
    System.out.println("Enter the number of Customer\nEnter the name\nEnter the address\nEnter the contact number\nEnter the email\nEnter the ProofType");
System.out.println("Enter the proof ID\nRegistration Successfull\nYour Details:");
    
    c.name(n,na);
    c.address(ad);
	c.co(nu);
    c.email(em);
    c.prooft(pt);
    c.proofi(pi);
    System.out.println("Your id is "+n);

  	
  }
}