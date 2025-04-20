package collection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_InterfaceProgarm2 {

	public static void main(String[] args) {

		
		Map<String, Integer> m1= new HashMap<String, Integer>(); //(Items and Quantity
		m1.put("Sugar", 10);
		m1.put("Salt", 3);
		m1.put("Jaggary", 5);
		m1.put("Oil", 1);
		
		System.out.println("Fetching All Keys");
		for( String s1:m1.keySet())
		{
			System.out.println(s1);
		}
    
		System.out.println("Fetching All values");
		for(  Integer s2: m1.values())
		{
			System.out.println(s2);
		}
		
		System.out.println("Fetching All Keys and Values together");
		for( java.util.Map.Entry<String, Integer> e2 :m1.entrySet())
		{
			System.out.println(e2);
		}
	

		
				
	
	
	
	}

}
