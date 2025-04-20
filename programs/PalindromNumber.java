package programs;

public class PalindromNumber {

	public static void main(String[] args) 
	
	{
		int input = 12345;
		int input1 = input;
		int reverse = 0;
		 
		while(input1>0)
		{
		reverse = reverse * 10 + input1%10;         
		input1 = input1/10;                             	
		}
		
		System.out.println(input);
		System.out.println(reverse);
		
		if(input==reverse)
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.println("not palindrome");
		}
}} 




	/*	int num=121;
		int num1=num;
		int rev=0;
		while (num1!=0)
		{
			rev=rev*10+num1%10;
			num1=num1/10;
			
		}
		if(num==rev)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
*/
	
