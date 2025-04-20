package practice;

import java.util.Scanner;

public class conditialStatmentWithScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner (System.in);
		//pen=10, notebook=40
		System.out.println("Customer cash amout: ");
		
		int cash = sc.nextInt();
		if(cash<10)
		{
			System.out.println("can not by anything");
			System.out.println("get more cash");
		}
		else if (cash>10 && cash<50)
		{
			System.out.println("can get 1 thing");
		}
		else 
		{
			System.out.println("can get both");
		}
		sc.close();
	}

}
