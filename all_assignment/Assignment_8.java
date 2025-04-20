package all_assignment;
                               //WAP to call Constructor Overloading
public class Assignment_8 {
	
	 Assignment_8(char h)
	{
		 this(876);
		System.out.println("constructor 0");

	}
	Assignment_8(int a)
	{
		System.out.println("constructor 1");
	}

	Assignment_8(boolean a, boolean b, char d)
	{
		System.out.println("constructor 2");

	}
	
	Assignment_8()
	{
		System.out.println("constructor 3");

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new Assignment_8('h');

		new Assignment_8(true,false, 'M');
		new Assignment_8();

	}

}
