package collection;
import java.util.*;
             // Assignment 43- Write a program to demonstrate the properties of Set in Java 
public class SetPropertisAll {

	public static void main(String[] args) {

	
		        // Creating a Set using HashSet
		        Set<String> s1 = new HashSet<String>();

		        // 1. add() - Adding elements to the Set
		        s1.add("Apple");
		        s1.add("Banana");
		        s1.add("Cherry");
		        s1.add("Date");
		        s1.add("Apple"); // Duplicate, will not be added
		        System.out.println("Set after adding elements: " + s1);

		        // 2. contains() - Check if the set contains an element
		        System.out.println("Does the set contain 'Apple'? " + s1.contains("Apple"));

		        // 3. remove() - Remove an element from the set
		        s1.remove("Banana");
		        System.out.println("Set after removing 'Banana': " + s1);

		        // 4. size() - Get the size of the set
		        System.out.println("Size of the set: " + s1.size());

		        // 5. isEmpty() - Check if the set is empty
		        System.out.println("Is the set empty? " + s1.isEmpty());

		        // 6. Iterating over a Set using forEach loop
		        System.out.println("Iterating over the set:");
		        for (String fruit : s1) {
		            System.out.println(fruit);
		        }

		        // 7. Converting Set to an Array
		        String[] array = s1.toArray(new String[0]);
		        System.out.println("Array elements: " + Arrays.toString(array));

		        // 8. Clearing the Set
		        s1.clear();
		        System.out.println("Set after clearing: " + s1);
		    }
		

}
