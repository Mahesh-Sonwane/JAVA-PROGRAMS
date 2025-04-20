package string;

// Assignment 40 - Write a program to demonstrate the following functions like append, insert, replace, delete, reverse, capacity, charAt, length, substring(int)
//                  & substring (start & end index) using StringBuffer concept

public class StringBufferMethods {

	public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Automation");
                
       // sb.append(" Testing");
       // sb.insert(10, " Testing");
       //   sb.replace(4, 10, "-mode");
       //  sb.delete(4, 10);
      //  sb.reverse();
       // System.out.println("After reverse: " + sb);
        System.out.println("Buffer Capacity: " + sb.capacity());
        System.out.println("String Length: " + sb.length());
        System.out.println("Character at index 4: " + sb.charAt(4));
        System.out.println("Substring from index 6: " + sb.substring(6));
        System.out.println("Substring (0, 5): " + sb.substring(0, 5));
        System.out.println("After reverse: " + sb.toString());  //After conversion, str is now a String, meaning further modifications would require creating a new string instead of modifying the existing one

        
		
	}

}
