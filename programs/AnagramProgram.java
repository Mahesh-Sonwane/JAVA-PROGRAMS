package programs;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		
		String s1= "tap";
		String s2= "pat";
		
		  char a[] = s1.toCharArray();
		  char b[] = s2.toCharArray();
		  
		  Arrays.sort(a);
		  Arrays.sort(b);
		  
	boolean b1=	Arrays.equals(a,b);
	   if(b1==true)
	   {
		   System.out.println("String is anagram");
	   }
	   else
		   System.out.println("String is not anagram");
		   
	   }

		
		

	}


