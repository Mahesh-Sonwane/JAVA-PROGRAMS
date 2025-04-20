package programs;

import java.util.Arrays;

public class CountDuplicates {
	
	public static void main(String[] args) 
	{
	
		String s1 = "Automation ATesting";
		char [] c1=		s1.toCharArray();
		Arrays.sort(c1);//a,a,b,c    alphabets order
		System.out.println(Arrays.toString(c1));
		int count=1;
		for(int i=0;i<c1.length-1;i++)
		{
			if(c1[i]==c1[i+1])
			{
				count++;
			}
			else
			{
				if(count>1)
				{
					System.out.println(c1[i] +" has occured " + count + " times");
				}
				count=1;	
			}
		}
		if(count>1)
		{
			System.out.println(c1[c1.length-1] +" has occured " + count + " times");
	
		}
		
		
		
	}

}
