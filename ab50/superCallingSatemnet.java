package ab50;

// Assignment 23  WAP to implement super calling statement (parameterized and non parameterized) 

class SuperParent1 
{
    SuperParent1(int i)            
    {
        System.out.println("Parent class constructor");
    }
}


class Child extends SuperParent1 
{	
    Child() 
    {
        super(12);                           // Calls Parent() constructor
        System.out.println("Child class constructor");
    }
}



public class superCallingSatemnet {

	public static void main(String[] args) {
      new Child(); // Creating an object of Child
       
	}
}
