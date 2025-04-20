package arrays;

import java.util.Arrays;
import java.util.Scanner;

// Assignment 28 - WAP to create an array of size 4 which belongs to int type and copy its values into a new array

public class ArraysProgram_2 {

	public static void main(String[] args) {
		
		System.out.println("Size of array-");
		Scanner sc=new Scanner(System.in);
		
		int rollno[]= new int[sc.nextInt()];
		
		for(int i=0; i<=rollno.length-1; i++)
		{
			System.out.println("Enter the value of array at index-- "+i);

			    rollno [i]= sc.nextInt();
		}
          System.out.println(Arrays.toString(rollno));
          
          int rollno1 []= new int[rollno.length];
          
            /*   
             * rollno1[0]=rollno[0];
             * rollno1[1]=rollno[1];
             * rollno1[2]=rollno[2];
             */
          
          for(int j=0; j<=rollno1.length-1; j++)
          {
        	  rollno1[j]=rollno[j];
          }
             System.out.println("copyed array is---");
          System.out.println(Arrays.toString(rollno1));
	}

}
