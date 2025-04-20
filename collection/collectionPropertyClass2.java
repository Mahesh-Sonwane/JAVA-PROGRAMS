package collection;

import java.util.ArrayList;
import java.util.Collection;

public class collectionPropertyClass2 {

	public static void main(String[] args) {

		Collection<String> c1= new ArrayList<String>();
		c1.add("arun");
		c1.add("ram");
		c1.add("jay");
		c1.add("karan");
		
		System.out.println(c1);
		
		
		Collection<String> c2= new ArrayList<String>();
         c2.add("bhart");
         c2.add("pratik");
         c2.add("mahesh");
         
 		System.out.println(c2);
 		
 		
 		c2.addAll(c1);                             //.addAll();
		System.out.println(c2);

		c2.remove("mahesh");                      //.remove();
   //   c2.removeAll(c1);                         //.removeAll();
   //	 c2.clear(); 
		System.out.println(c2);


		
		
	}

}
