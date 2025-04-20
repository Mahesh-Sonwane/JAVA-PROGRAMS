package arrays;

import java.util.Arrays;

// Assignment 29- WAP to create an array of size 4 which belongs to int type 
//                 and copy its values into a new array in reverse order
public class ArraysProgram_3 {

	public static void main(String[] args) {
		
		int rollno1[]= new int[4];
		rollno1[0]=33;
		rollno1[1]=22;
		rollno1[2]=44;
		rollno1[3]=55;
		 
		int rollno2 []=new int [4];
		
		for(int i=0,j=3; i<=3; i++, j--)
		{
			rollno2[j]=rollno1[i];
			
		  /*rollno2[2]=rollno1[1];
			rollno2[1]=rollno1[2];
			rollno2[0]=rollno1[3];
		  */
		}
		
		System.out.println("Given array is-- "+ Arrays.toString(rollno1));

		System.out.println(Arrays.toString(rollno2));

	}

}
