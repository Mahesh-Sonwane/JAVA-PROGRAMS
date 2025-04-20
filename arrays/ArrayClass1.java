package arrays;

import java.util.Arrays;

public class ArrayClass1 {

	public static void main(String[] args) {
		
		int rollno[]=new int[4];
		
	    rollno[0]=56;
		rollno[1]=5;
		rollno[2]=87;
		rollno[3]=20;
		
	/*	for(int i=0; i<=3; i++)
		{
			System.out.println(rollno[i]);
		}
    */
            
		System.out.println(Arrays.toString(rollno));	//Correct way
		
	}

}
