package all_assignment;

import java.util.Scanner;

public class Assignment_6 {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner s1=new Scanner(System.in);
		
	//  1.Area of Square---
			System.out.println("To Find square Area then enter lenth l1");
			int  l1= s1.nextInt();
		    int squareArea= l1*l1;
			System.out.println("Square Area:"+ squareArea);

   //  2.Circumference of Square---
			System.out.println("To Find square Circumference then enter lenth l2");
			int  l2= s1.nextInt();
		    int squareCircumference= 4*l2;
			System.out.println("Square Circumference:"+ squareCircumference);
			
   //    3.Area of circle----
			System.out.println("To Find Circle Area then enter redius r");
	        double r=s1.nextInt();
	        double circleArea = 3.14*r*r;
			System.out.println("Circle Area:"+ circleArea);
			
   //    4.Circumference of Circle---
			System.out.println("To Find cirlce Circumference Area then enter redius r2");
			double r2=s1.nextDouble();
			double circleCircumference= 2*3.14*r2;
			System.out.println("Circle Circumference:"+ circleCircumference);
			s1.close();
	}

}
