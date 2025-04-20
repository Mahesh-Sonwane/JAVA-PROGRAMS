package collection;
                     // Assignment 39-- WAP to implement while loop
                            
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListPropertyProgram {

	public static void main(String[] args) {

		List <Integer> l1= new ArrayList<Integer>();
		l1.add(23);
		l1.add(43);
		l1.add(76);
		l1.add(12);
		l1.add(45);
		 
		System.out.println(" Iterator-> forward Iteration");
	    Iterator <Integer> l2 = l1.iterator();
	       while(l2.hasNext())
	       {
	    	   System.out.println(l2.next());
	       }
	       
		     //Methods of listIterator--    hasnext(),next(), hasprevious(), previous(), remove(), set().
	       
		  System.out.println("ListIterator-> forward Iteration");
		  ListIterator<Integer> l3 = l1.listIterator();
		  while(l3.hasNext())
		  {
			  System.out.println(l3.next());
		  }
		  
		  
		  
		  System.out.println("ListIterator-> backward Iteration");
		  while(l3.hasPrevious())
		  {
			  System.out.println(l3.previous());
		  }
   
	}

}
