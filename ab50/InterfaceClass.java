package ab50;


interface DEF
{
	void Method1 ();
	void Method2 ();
}

interface XYZ extends DEF
{
	void Method3 ();
	void Method4 ();
}
                                                       //  class ----> interface     use   implements keyword
                                                       //  interface ----> interface     use   extends keyword


public class InterfaceClass implements XYZ
{

		public void Method1()
		{
															
	    }

    	public void Method2()
    	{
    		
    	}

														
	    public void Method3() 
	    {
															
		}

     	public void Method4()
     	{
															
		}
     	
  	public static void main(String[] args) 
     	{

    	}

	

}
