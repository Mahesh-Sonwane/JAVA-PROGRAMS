package programs;
                           //Assignment 25 -  WAP to reverse a string
public class ReverseString {

	public static void main(String[] args) {
		
		String input="RAM";
		String output="";
		
		for(int i=input.length()-1; i>=0 ; i--)
		{
			output=output+ input.charAt(i);
		}
              System.out.println(output);
			

		}
	}


/*
  i=2,   output  =  +M=M
  i=1,   output  =M+A=MA
  i=0,   output  =MA+R=MAR
*/