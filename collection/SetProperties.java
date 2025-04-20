package collection;

import java.util.HashSet;
import java.util.Set;

public class SetProperties {

	public static void main(String[] args) {

		Set<Integer> s1= new HashSet<Integer>();
		s1.add(65);
		s1.add(76);
		s1.add(80);
		s1.add(36);
		s1.add(36);           //duplicates not accept in set
		
       System.out.println(s1);
		
		
		
		
		
		
		
	}

}
