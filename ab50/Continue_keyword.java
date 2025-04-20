package ab50;

public class Continue_keyword {
	
	public static void main (String[] args)
	{
		for (int i=1; i<=10; i++)
		{
			if(i==8)              //skipping iteration
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
