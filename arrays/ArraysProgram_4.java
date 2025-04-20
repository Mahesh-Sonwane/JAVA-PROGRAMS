package arrays;

import java.util.Arrays;

// Assignment -30 WAP to accept the values of 2 arrays at run-time and compare if both are equal.

public class ArraysProgram_4 {

	public static void main(String[] args) {
		
		int rollno1[]=new int[4];
		
		int rollno2[]=new int[4];
		
		rollno1[0]=10;
		rollno1[1]=20;
		rollno1[2]=30;
		rollno1[3]=40;
		
		rollno2[0]=10;
		rollno2[1]=20;
		rollno2[2]=40;
		rollno2[3]=40;
		
     boolean answer = Arrays.equals(rollno1,rollno2);
   

     if(answer==true)
     {
    	 System.out.println("Both Arrays are equal");
     }
     else
     {
    	 System.out.println("Both Arrays are not equal");

     }
	}

}
