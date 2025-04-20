package ab50;

import java.util.Scanner;

public class AdditionUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value a");
		int  a= s1.nextInt();
		
		System.out.println("Enter the value b");
		int  b= s1.nextInt();
		
		System.out.println("Total");
		int sum=a+b;
		System.out.println(sum);

	}

}
