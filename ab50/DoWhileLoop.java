package ab50;

public class DoWhileLoop {

	//The do-while loop is similar to the while loop, but it executes the block of code at least once, even if the condition is false.

	
	public static void main(String[] args) {
		
        int count = 2;
        
        do 
        {
            System.out.println("Count: " + count);
            count++;
        } 
        while (count <= 5);  // Loop runs while count is less than or equal to 5
    }
	

}
