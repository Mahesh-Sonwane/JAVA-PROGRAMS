package ab50;

  // Assignment 23  WAP to implement this() calling statement

public class thisCallingStatment {
	
	thisCallingStatment ()
	{
		 
		System.out.println("constructor 1");
	}
	thisCallingStatment (int a)
	{
		this();
		System.out.println("constructor 2");
	
	}
	
	public static void main (String [] args)
	{
		new thisCallingStatment (12);
	}

}

//Using this calling statement able to call one constructor from another constructor in same class. Its make chaning process.