package collection;

import java.util.ArrayList;
import java.util.Collection;

public class colllectionPropertisClass3 {

public static void main(String[] args)
{
 Collection <Character> c1= new ArrayList <Character>();
    c1.add('A');
    c1.add('B');
    c1.add('C');
    c1.add('D');
    c1.add('E');
    System.out.println(c1);
		
    Collection <Character> c2= new ArrayList <Character>();
    c2.add('a');
    c2.add('b');
    c2.add('c');
    c2.add('d');
    c2.add('e');

    System.out.println(c2);
    
  //  c2.clear();                                 //.clear();
    int k=  c2.size();                            //.size();
     System.out.println(k);
        
       boolean b2 =c2.equals(c1);                 //.equals();
       System.out.println(b2);

       boolean b3= c2.contains('Y');             //.contains();
       System.out.println(b3);
       
       c2.addAll(c1);                           
       boolean b4= c2.containsAll(c1);           //.containsAll();
       System.out.println(b4); 

    

    
		
		
		
	}

}
