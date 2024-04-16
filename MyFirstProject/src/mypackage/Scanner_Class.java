package mypackage;

import java.util.Scanner;
import java.util.*;

public class Scanner_Class {

	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		int firstno= s1.nextInt();
		int secondno= s1.nextInt();
		int sum= firstno+secondno;
		System.out.println(sum);
		
		
	}

}
