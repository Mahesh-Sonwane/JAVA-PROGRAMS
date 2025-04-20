package arrays;

        // Assignment 31- WAP to count the number of numeric values present in the String
       // Assignment 32- WAP to count the number of alphabets present in the String
// Assignment 33- WAP to count the number of spaces present in the String
// Assignment 34- WAP to count the number of Special Chars present in the String


import java.util.Arrays;
                                                                // Another easy way is solved this program in "programs" package checkout.
public class ArraysProgram_5 {

	public static void main(String[] args) {
		
		int countofnumeric=0;
		int countofspace =0;
		int countofAlphabets=0;
		
		String name= "mahesh 19 95 &?%#@";
		  char c1 []= name.toCharArray();
		  System.out.println(Arrays.toString(c1));
		  
		  for( int i=0; i<c1.length-1; i++)
		  {
			  boolean b1 = Character.isDigit(c1[i]);                   //Character is a class to perform on char 
			  boolean b2 = Character.isWhitespace(c1[i]);
			  boolean b3 = Character.isAlphabetic(c1[i]);

			  
			  if(b1==true)
			  {
				  countofnumeric++;
			  }
			  if(b2==true)
			  {
				  countofspace++;
			  }
			  if(b3==true)
			  {
				  countofAlphabets++;
			  }
			  
		  }
         System.out.println("Count of numeric letters are-- "+countofnumeric);
         System.out.println("Count of spaces  are-- "+countofspace);
         System.out.println("count of Alphabets  are-- "+countofAlphabets);
         
         int specialchar=name.length()-(countofnumeric+countofspace+countofAlphabets);
         System.out.println("count of special char-- "+specialchar);
         
	}

}
