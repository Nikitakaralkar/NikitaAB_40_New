package myassignments;

import java.util.Scanner;

public class Area_Of_Circle {

	static final double  pi = 3.14;
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter radius");
		int r = sc.nextInt();
		sc.close();
		double area = pi*r*r;
		System.out.println("Area of Circle is:" +area);
		
		
		
	}

}
