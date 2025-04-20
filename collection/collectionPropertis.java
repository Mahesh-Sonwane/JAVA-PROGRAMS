package collection;

import java.util.ArrayList;
import java.util.Collection;

public class collectionPropertis {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		c1.add("Manish");
		c1.add(34);
		c1.add('M');
		c1.add(true);                        //.add();
		c1.add(34);
		c1.add(null);

/*  Properties of collection is follow-
 *   indexing
 *   order of insertion
 *   duplicate
 *   null
 *   hetrogenious
 */
		System.out.println(c1);
		

	}

}
