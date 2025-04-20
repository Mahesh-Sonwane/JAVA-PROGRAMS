package ab50_Inheritance;

//Assignment 20: WAP to create relation between 2 classes having non-static methods using extends keyword. Single Level Inheritance.



class Supper 
{
	 void login()
	{
		System.out.println("Login");
	}
	
	 void logout()
	{
		System.out.println("Logout");

	}
}


public class Assignment_20 extends Supper
{
	
	  void addTocard ()
	    {
		  System.out.println("Mobile is added to card");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment_20 a =new Assignment_20 ();
		a.login();
		a.addTocard();
		a.logout();

	}

}
