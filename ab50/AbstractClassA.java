package ab50;

abstract class ClassB
{
	
	abstract void StartMethod1 ();              // Abstract method 1(no implementation)
	abstract void StartMethod2 ();              // Abstract method 2(no implementation)
	
	void Method3 ()                        // Concrete method (implemented)
	{
        System.out.println("Vehicle is stopping...");

	}
	
}


public class AbstractClassA extends ClassB
{
	
	void StartMethod1() 
	{
        System.out.println("Car is starting with a key...");

	}

	void StartMethod2() 
	{
        System.out.println("Car is starting with a Phone App...");

	}
	
	public static void main(String[] args)
	{
		AbstractClassA ab = new AbstractClassA ();
		ab.StartMethod1();
		ab.StartMethod2();
		ab.Method3();
		
	}



}
