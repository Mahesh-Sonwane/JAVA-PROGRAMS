package programs;

public class CountofVowels_Consonant {

	public static void main(String[] args) {
		
		String name ="automationtesting";
		char a[] =name.toCharArray();
		
		int countofvowel=0;
		int countofConsonant=0;
		
		for(int i=0; i<=a.length-1;i++)
		{
			if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
			{
				countofvowel++;
			}
			else
			{
				countofConsonant++;
			}
		}
		System.out.println("countofvowel "+countofvowel);
		System.out.println("countofConsonant "+countofConsonant);

	}

}
