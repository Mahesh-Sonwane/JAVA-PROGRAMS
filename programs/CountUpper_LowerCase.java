package programs;

public class CountUpper_LowerCase {

	private static final boolean Charcter = false;

	public static void main(String[] args) {

		String name = "Automation Testing";
		char []a=name.toCharArray();
		
		int countOfUpperCase= 0;
		int countOfLoweCase=0;
		
		for(int i=0; i<=a.length-1; i++)
		{
		  if(Character.isUpperCase(a[i]))
		  {
			  countOfUpperCase++;
		  }
		  else
		  {
			  countOfLoweCase++;
		  }
		}
		System.out.println("countOfUpperCase "+countOfUpperCase);
		System.out.println("countOfLoweCase "+countOfLoweCase);
		
	}

}
