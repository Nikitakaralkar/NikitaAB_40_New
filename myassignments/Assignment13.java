package myassignments;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		
		double pi =3.14;
		
		for(int i=1;i<=10;i++)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of a circle");
		int r = sc.nextInt();
		double area_of_circle =pi*r*r;
		System.out.println("Area of circle is" +area_of_circle);
		
		}
		
		
	}

}
