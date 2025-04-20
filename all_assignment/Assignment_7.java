package all_assignment;
                               //WAP to call Method Overloading
public class Assignment_7 {
	
	static void add (int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void add(double a, int b)
	{
		double sum=a+b;
		System.out.println(sum);
		
	}
	
	 void add( int a)
	{
		double sum=a+8;
		System.out.println(sum);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(50,50);
		add(10.50,20);
		
		Assignment_7 z= new Assignment_7();
		z.add(10);
		
		
		

	}

}
