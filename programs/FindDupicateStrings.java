package programs;

public class FindDupicateStrings {

	public static void main(String[] args) {

		String s= "mahesh tech";
        char ch []=  s.toCharArray();
        
        for(int i=0; i<ch.length; i++)
        {
        	for(int j=i+1; j<ch.length; j++)
        	{
        		if (ch[j]==ch[i])
        		{
        			System.out.print(ch[j]);
        		}
        	}
        	
        }
	}

}
