package all_assignment;

public class Assignment_4 {
	
	//Non-static Method call in Main Method
		int a=20;
		int b=30;
		
		void add()
		   {     
			System.out.println(a+b);
		   }
		
		void sub()
		   {
		  	System.out.println(a-b);
		   }
		
		public static void main (String[] args)
		   {
			Assignment_4 m = new Assignment_4 ();
					
			m.add();
			m.sub();
					
			}

	}

