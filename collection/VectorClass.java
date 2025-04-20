package collection;

import java.util.Vector;

public class VectorClass {
	
	public static void main(String[] args) {
        // Creating a Vector of integers
        Vector<Integer> numbers = new Vector<>();

        // Adding elements using addElement()
        numbers.addElement(10);
        numbers.addElement(20);
        numbers.addElement(30);
        numbers.addElement(40);
        numbers.addElement(50);
        
        System.out.println("Vector Elements: " + numbers);

        // Displaying first and last elements
        System.out.println("First Element: " + numbers.firstElement());
        System.out.println("Last Element: " + numbers.lastElement());

        // Removing an element using removeElement()
        numbers.removeElement(30);
        System.out.println("After removing element 30: " + numbers);

        // Removing element at a specific index using removeElementAt()
        numbers.removeElementAt(2); // Removes element at index 2
        System.out.println("After removing element at index 2: " + numbers);

        // Checking current capacity
        System.out.println("Vector Capacity: " + numbers.capacity());

        // Removing all elements using removeAllElements()
        numbers.removeAllElements();
        System.out.println("After removing all elements: " + numbers);
    }
	
	
	

}
