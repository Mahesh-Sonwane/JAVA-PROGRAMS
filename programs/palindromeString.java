package programs;
          //Assignment 26- WAP to check if the given strings are 'palindrom' or not. 

public class palindromeString {

	public static void main(String[] args) {
       
		String input= "MADAM";
		String output="";
		
		for(int i=input.length()-1; i>=0; i--)
		{
			
			output=output+input.charAt(i);
		}
		System.out.println(output);
		
		if(input.equals(output))
		{
			System.out.println("My string is palindrom");
		}
		else
		{
			System.out.println("My string is not palindrom");
	
		}
		
		
	}

}
