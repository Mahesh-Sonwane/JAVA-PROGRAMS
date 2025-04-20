package collection;
import java.util.*;
                      // Assignment 42- Write a program to demonstrate the properties of List in Java
public class ListPropertisAll {
	
	    public static void main(String[] args) {
	        // Creating a List using ArrayList
	        List<String> list = new ArrayList<>();

	        // 1. add() - Adding elements to the List
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");
	        System.out.println("List after adding elements: " + list);

	        // 2. add(index, element) - Insert element at a specific index
	        list.add(2, "Blueberry");
	        System.out.println("List after inserting 'Blueberry' at index 2: " + list);

	        // 3. get(index) - Get an element by index
	        System.out.println("Element at index 3: " + list.get(3));

	        // 4. set(index, element) - Replace element at a specific index
	        list.set(1, "Blackberry");
	        System.out.println("List after replacing 'Banana' with 'Blackberry': " + list);

	        // 5. remove(index) - Remove element at a specific index
	        list.remove(3);
	        System.out.println("List after removing element at index 3: " + list);

	        // 6. contains() - Check if the list contains an element
	        System.out.println("Does the list contain 'Apple'? " + list.contains("Apple"));

	        // 7. size() - Get the size of the list
	        System.out.println("Size of the list: " + list.size());

	        // 8. indexOf() - Get the index of a specific element
	        System.out.println("Index of 'Cherry': " + list.indexOf("Cherry"));

	        // 9. isEmpty() - Check if the list is empty
	        System.out.println("Is the list empty? " + list.isEmpty());

	        // 10. Iterating over a List using forEach loop
	        System.out.println("Iterating over the list:");
	        for (String fruit : list) {
	            System.out.println(fruit);
	        }

	        // 11. Converting List to Array
	        String[] array = list.toArray(new String[0]);
	        System.out.println("Array elements: " + Arrays.toString(array));

	        // 12. Sorting the list
	        Collections.sort(list);
	        System.out.println("Sorted List: " + list);

	        // 13. Clearing the list
	        list.clear();
	        System.out.println("List after clearing: " + list);
	    }
}
