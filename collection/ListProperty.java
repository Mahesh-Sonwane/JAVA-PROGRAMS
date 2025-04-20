package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListProperty {

	public static void main(String[] args) {
		
		List l1=new ArrayList();
		l1.add("Manish");
		l1.add("Ram");
		l1.add("Harish");
		System.out.println(l1);
		
	   Iterator  l2= l1.iterator();
	   
	   //hasnext()- boolean- next element is present or not present ?
	   // next()- object.
	   
		
		while(l2.hasNext())
		{
			System.out.println(l2.next());
		}

	}

}
