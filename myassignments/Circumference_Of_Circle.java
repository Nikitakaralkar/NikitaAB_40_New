package myassignments;

import java.util.Scanner;

public class Circumference_Of_Circle {

	
	static final double  pi = 3.14;
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter radius");
		int r = sc.nextInt();
		sc.close();
		double area = 2*pi*r;
		System.out.println("Circumference of a Circle is:" +area);
	}

}
