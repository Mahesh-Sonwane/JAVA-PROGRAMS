package ab50;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		
		   /*      byte   a= s1.nextByte();
		         short  b= s1.nextShort();
		         int    c= s1.nextInt();
		         long   d=s1.nextLong();
		         float  e=s1.nextFloat();
		         double f=s1.nextDouble();
		         boolean g=s1.nextBoolean(); 
		         String  name= s1.next();      */
		         String  name= s1.nextLine();      // for 
		         System.out.println(name);
		         
		         s1.close();
	}

}
