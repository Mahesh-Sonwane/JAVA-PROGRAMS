package string;

public class StringClass3 {

	public static void main(String[] args) {

		String a = "Automation Testing";
		
		int size= a.length();                         //length();
		System.out.println("1-  "+size);
		
		String a1=a.toUpperCase();                    //toUpperCase();
		System.out.println("2-  "+a1);
		
		String a2=a.toLowerCase();                    //toLowerCase();
		System.out.println("3-  "+a2);
		
		 char a3= a.charAt(4);                        //charAt(4);
		 System.out.println(a3);
		 
		 String a4= a.substring(11);		          //substring(11);
		 System.out.println(a4);
		 
		 String a5= a.substring(0,10);		     // +1 in end indexing  (9+1)
		 System.out.println(a5);
		 
		 int a6=a.indexOf('m');                       //indexOf('T');
		 System.out.println(a6);
			
	}

}
