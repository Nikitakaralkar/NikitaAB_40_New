package myassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_20_1 {

	public static void main(String[] args) {
	
		
		int a[]= new int[5];
		System.out.println("Size of your array is:" +a.length);
		System.out.println("Enter array elements");
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Entered Array Elements are:"  +Arrays.toString(a));
	}

}
