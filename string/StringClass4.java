package string;

public class StringClass4 {

	public static void main(String[] args) {

		String input= "        Manish Kumar tiwari";               //.trim();    function not removing the middle space of string.
		System.out.println(input);
		System.out.println(input.trim());
		
		String m= "          Automation         ";      
		System.out.println(m.trim());
		
		String a ="mahesh";
		boolean answer = a.equals("Mahesh");                      // .equals();
		System.out.println(answer);
		
		String m2= "Mahesh";
		boolean	answer2=m2.equalsIgnoreCase("mahesh");                   // .equalsIgnoreCase    string1 and string2 are compared without considering case.
		System.out.println(answer2);
		
		
		String m3= "mobilen device";
		boolean answer3= m3.contains("device");                   // .contains();
	    System.out.println(answer3);
	    
	    boolean d=m3.startsWith("m");                            //.startsWith();
	    System.out.println(d);
	    
	    boolean d2=m3.endsWith("n");                             //.endsWith();
	    System.out.println(d2);

	
	
	
	}
		
		
		
}