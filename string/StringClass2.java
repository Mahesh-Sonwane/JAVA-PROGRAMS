package string;

                                    //Mutable and Immutable 
//Mutable---> can be change.
//Immutable--> can not be change.

public class StringClass2 {

	public static void main (String args[])
	{
		String a= "Automation";                      //you created a string
		   a.concat("Testing");
		     System.out.println(a.concat(" Testing"));  //you created another string
		   
		     System.out.println(a);              //Immutable--> can not be changed.
		 
		   

		StringBuilder s1= new StringBuilder("Automation");
		   // s1.append("Testing");
		     System.out.println(s1.append(" Testing"));
		
			 System.out.println(s1);            //Mutable--> can be changed.
			 
			 
			 
	    StringBuffer sb= new StringBuffer("Manual");
	         System.out.println(sb.append(" Testng"));
	   
		     System.out.println(sb);           //Mutable--> can be changed.

	   

		
		
	
		
		
	}
	
	
}
