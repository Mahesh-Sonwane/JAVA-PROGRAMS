package collection;
               // Assignment 38- How to sort a collection?

import java.util.ArrayList;
import java.util.Collections;

public class collectionSortMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> c1=new ArrayList<Integer>();
		c1.add(35);
		c1.add(12);
		c1.add(64);
		c1.add(23);
		c1.add(98);
//		Collections.sort(c1);                             //Acceding 
//		Collections.sort(c1, Collections.reverseOrder()); //Descending
     	Collections.reverse(c1);                          //reverse
		System.out.println(c1);
		

	}

}
