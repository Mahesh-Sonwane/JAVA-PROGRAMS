package programs;

public class StringCoutDuplicate {

		public static void main(String[] args) 
		{

			String ms = "meher";

			char s1[] = ms.toCharArray();

			int count = 0;


	for (int i = 0; i <= s1.length - 1; i++) 
	{

			for (int j = i + 1; j <= s1.length - 1; j++)
			{

				if (s1[i] == s1[j]) 
				{

					if (s1[j] == ' ')
					{

			  		continue;

					} 
					else
					{
						count++;
					}

				}

			}

	 }
	  if (count > 0)
			{
				System.out.println("duplicate char present " + count);
			}
	  else
			{
				System.out.println("duplicate char not present");
			}

		}

	}


