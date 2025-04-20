package arrays;

import java.util.Arrays;
import java.util.Scanner;

  // Assignment 27 - WAP to create an array of size 4 which belongs to int type and accept its input at run-time


public class ArraysProgram_1 {

	public static void main(String[] args) 
	{
		
        System.out.println("Size of array - ");

		Scanner sc =new Scanner (System.in);
		
		int rollno []= new int [sc.nextInt()];
		
		for(int i=0; i<=rollno.length-1; i++)
		{
	        System.out.println("Enter the value of array at indexing - "+ i);

		  rollno [i]=  sc.nextInt();
		} 
        System.out.println(Arrays.toString(rollno));
	}

}
