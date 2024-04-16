package mypackage;

import java.util.Scanner;

public class Scanner_Class1 {

	public static void main(String[] args) {
        
		Scanner s1= new Scanner(System.in);
		String name = s1.next();
		//System.out.println();
		byte b1= s1.nextByte();
		short b2 = s1.nextShort();
		int b3= s1.nextInt();
		long b4= s1.nextLong();
		float b5= s1.nextFloat();
		double b6= s1.nextDouble();
		
		boolean b7= s1.nextBoolean();
		s1.close();
		
		
		
		
		
		
		
		

	}

}
