package ab50;

 class Parent_Class 
{
	 void login()
	 {
		System.out.println("Login with email id");
	 }
	
}


public class MethodOverriding extends Parent_Class
{
    void login()
    {
    	super.login();                                 //  super keyword
		System.out.println("Login with mobile no");

    }
    
    public static void main(String[] args) 
    {
    	MethodOverriding s= new MethodOverriding();
    	s.login();

    }
	
}
