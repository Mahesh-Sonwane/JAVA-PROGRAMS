package ab50_Inheritance;
   
//Assignment 19 : WAP to create relation between 2 classes having static methods using extends keyword. Single Level Inheritance.

class Parent 
{
	static void login()
	{
		System.out.println("Login");
	}
	
	static void logout()
	{
		System.out.println("Logout");

	}
}

public class Assignment_19 extends Parent
{
     static void addTocard ()
    {
	  System.out.println("Mobile is added to card");
    }
	
public static void main(String[] args) 
	
{
		login();
		addTocard();
		logout();
}

}
