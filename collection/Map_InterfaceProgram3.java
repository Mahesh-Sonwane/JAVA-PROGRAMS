package collection;
import java.util.*;
               /* Assignment 44- "Write a program to demonstrate the Map interface with the given details:
                                 1.Name and Bodyweight
                                 2.BankName and Bank Account ID
                                 3.Firstname and Lastname
                                 4.List of Household Items and their Quantities"  */

public class Map_InterfaceProgram3 {
	
	    public static void main(String[] args) {
	    	
	        // 1. Name and Bodyweight (String - Double)
	        Map<String, Double> nw = new HashMap<String, Double>();
	        nw.put("RAM", 55.5);
	        nw.put("SHAM", 75.3);
	        nw.put("KARAN", 68.2);
	        System.out.println("Name and Bodyweight: " + nw);

	        // 2. BankName and Bank Account ID (String - String)
	        Map<String, Integer> ba = new HashMap<String, Integer>();
	        ba.put("BOI", 123456789);
	        ba.put("CB", 987654321);
	        ba.put("CBOI", 456789123);
	        System.out.println("Bank Name and Account ID: " + ba);

	        // 3. Firstname and Lastname (String - String)
	        Map<String, String> fl = new HashMap<>();
	        fl.put("John", "Doe");
	        fl.put("Jane", "Smith");
	        fl.put("Michael", "Johnson");
	        System.out.println("First Name and Last Name: " +  fl);

	        // 4. Household Items and their Quantities (String -> Integer)
	        Map<String, Integer> iq = new HashMap<String, Integer>();
	        iq.put("Milk", 2);
	        iq.put("Bread", 1);
	        iq.put("Eggs", 12);
	        iq.put("Soap", 3);
	        System.out.println("Household Items and Quantities: " + iq);

	        // Iterating over the maps
	        System.out.println("Iterating over Name and Bodyweight Map:");
	        for (Map.Entry<String, Double> e1 : nw.entrySet())
	        {
	            System.out.println(e1.getKey() + " weighs " + e1.getValue() + " kg");
	        }

	        System.out.println("Iterating over Bank Name and Account Map:");
	        for (Map.Entry<String, Integer> e2 : ba.entrySet())
	        {
	            System.out.println("Bank: " + e2.getKey() + ", Account ID: " + e2.getValue());
	        }

	        System.out.println("\nIterating over First Name and Last Name Map:");
	        for (Map.Entry<String, String> e3 : fl.entrySet()) 
	        {
	            System.out.println("First Name: " + e3.getKey() + ", Last Name: " + e3.getValue());
	        }

	        System.out.println("\nIterating over Household Items Map:");
	        for (Map.Entry<String, Integer> e4 : iq.entrySet())
	        {
	            System.out.println("Item: " + e4.getKey() + ", Quantity: " + e4.getValue());
	        }
	    }

}
