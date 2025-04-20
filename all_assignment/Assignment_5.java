package all_assignment;     
                                     //WAP to call Constructors in main method

public class Assignment_5 {
	
	Assignment_5()      //non-parametrized const.
	{
		System.out.println("constructor calling");
	}
	
	
	Assignment_5(int a)      //parametrized const.
	{
		System.out.println("constructor calling for non para");
	}
	
	
	
	  public static void main  (String[] args) {
		  
		  new Assignment_5();
		  new Assignment_5(55);

		  
	  }


}
