package collection;

import java.util.HashMap;
import java.util.Map;

public class Map_InterfaceProgarm1 {

	public static void main(String[] args) {
		
		Map<Integer,String> m1= new HashMap<Integer,String>(); //AccountNo with name.
		m1.put(72816712, "Ram");
		m1.put(78698989, "Sita");
		m1.put(87676896, "Mahesh");
		m1.put(68776876, "Karan");
		
		m1.keySet();
		     System.out.println(m1);
		
		Map<Integer,String> m2= new HashMap<Integer,String>(); //AccountNo with name.
		
		m2.putAll(m1);
		      System.out.println(m2);
		      
		//m2.clear();
             //System.out.println(m2);
		      
       // Boolean b=m2.isEmpty();
            // System.out.println(b);
		      
		   m2.remove(78698989);
            System.out.println(m2);
         
            
           m2.remove(68776876, "Karan");
            System.out.println(m2);
            
           m2.putIfAbsent(2332323, "Lakhan");
           System.out.println(m2);
           
           m2.replace(87676896, "Krishna");
           System.out.println(m2);


        


	}

}
