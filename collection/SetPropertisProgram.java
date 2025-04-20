package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPropertisProgram {

	public static void main(String[] args) {

		Set<Integer> s1= new HashSet<Integer>();
		s1.add(65);
		s1.add(76);
		s1.add(80);
		s1.add(36);
		s1.add(90);          
       System.out.println(s1);
       
            Iterator  s2 = s1.iterator();
            while(s2.hasNext())
            {
            	System.out.println(s2.next());
            }
	
	}

}
