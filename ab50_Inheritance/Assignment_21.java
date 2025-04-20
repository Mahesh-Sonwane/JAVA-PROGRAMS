package ab50_Inheritance;

//Assignment 21: WAP to create relation between multiple classes containing both static and non-static methods.
//                 Multi Level Inheritance

class superParentClass 

{
	 static void login()
	 {
		 System.out.println("1-Login to Flipkart");
	 }
}

 class parentClass extends superParentClass 

{
	  void search()
	 {
		 System.out.println("2-Search the product");
	 }
	  
	  void addTocard()
	 {
		 System.out.println("3-Mobile is added to card");
	 }
}



public class Assignment_21 extends parentClass
{
	 void logout()
	 {
		 System.out.println("4-Log Out ");
	 }
	
	
	public static void main(String[] args) 
	
{
		login();
		Assignment_21 z =new Assignment_21();
		z.search();
		z.addTocard();
		z.logout();


}

}
