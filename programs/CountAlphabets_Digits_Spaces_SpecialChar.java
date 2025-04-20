package programs;

public class CountAlphabets_Digits_Spaces_SpecialChar {

	public static void main(String[] args) {
		// Character class - inbuilt method can be used to find no of
		//alphabets, numeric and spaces
		
		//1st step
		//converting string to array
		
		String name= "Mahesh 333 @!:/";
		char a[]=name.toCharArray();
		
		int countofAlpha=0;
		int countofNum=0;
		int countofSpace=0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(Character.isAlphabetic(a[i]))
			{
				countofAlpha++;
			}
			else if(Character.isDigit(a[i]))
			{
				countofNum++;
			}
			else if(Character.isWhitespace(a[i]))
			{
				countofSpace++;
			}
		}
		
		System.out.println("countofAlpha "+countofAlpha);
		System.out.println("countofNum "+countofNum);
		System.out.println("countofSpace "+countofSpace);
		
		// Count of Special Char --
		
		int countofSpecialChar= a.length-(countofAlpha+countofNum+countofSpace);
		System.out.println("countofSpecialChar "+countofSpecialChar);

		
		

	}

}
