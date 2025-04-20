package string;

// Assignment 41- Write a program to demonstrate the following functions like append, insert, replace, delete, reverse, capacity, charAt,
//                length, substring(int) & substring (start & end index) using StringBuilder concept

public class StringBuilderMethods {

	public static void main(String[] args) {
		
		        // Creating a StringBuilder object
		        StringBuilder sb = new StringBuilder("Hello");

		        // 1. append() - Adds text at the end
		        sb.append(" World");
		        System.out.println("After append: " + sb);

		        // 2. insert() - Inserts text at a specific position
		        sb.insert(6, "Beautiful ");
		        System.out.println("After insert: " + sb);

		        // 3. replace() - Replaces a portion of the string
		        sb.replace(6, 15, "Amazing");
		        System.out.println("After replace: " + sb);

		        // 4. delete() - Deletes characters from the string
		        sb.delete(6, 13);
		        System.out.println("After delete: " + sb);

		        // 5. reverse() - Reverses the string
		        sb.reverse();
		        System.out.println("After reverse: " + sb);

		        // Reversing back to original to continue operations
		        sb.reverse();

		        // 6. capacity() - Shows current buffer capacity
		        System.out.println("Buffer Capacity: " + sb.capacity());

		        // 7. charAt() - Gets character at a specific index
		        System.out.println("Character at index 4: " + sb.charAt(4));

		        // 8. length() - Gets the length of the string
		        System.out.println("String Length: " + sb.length());

		        // 9. substring(int start) - Extracts substring from given index
		        System.out.println("Substring from index 6: " + sb.substring(6));

		        // 10. substring(int start, int end) - Extracts substring from start to end index
		        System.out.println("Substring (0, 5): " + sb.substring(0, 5));	
		
	}

}
