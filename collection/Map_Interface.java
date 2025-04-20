package collection;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface {

	public static void main(String[] args) {

		Map m1= new HashMap();  // key-value,    name-gender
		m1.put("Persion1", 'M');
		m1.put("Persion2", 'F');
		m1.put("Persion3", 'F');
		m1.put("Persion4", 'M');
		m1.put("Persion5", 'F');
		
		System.out.println(m1);
	}

}
