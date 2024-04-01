package myassignments;

import java.util.Scanner;

public class Assignment16 {

	static int a=60;
	static int b=20;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you option 1.Add 2.Subtraction 3.Multiplication 4.Division 5.Modulus");
	    int s = sc.nextInt();
	    
		switch(s)
		{
		
		case 1:
            
			int Sum= a+b;
		    System.out.println("Addition is:" +Sum);
		    break;

		case 2:
            int sub= a-b;
			System.out.println("Subtraction is-" +sub);
			break;
			
		case 3:
            int mul=a*b;
			System.out.println("Multiplication is-" +mul);
			break;

		case 4:
            int div=a/b;
			System.out.println("Division is-" +div);
			break;

		case 5:
            int mod= a%b;
			System.out.println("Modulus is-" +mod);
			break;

		default:
			System.out.println("Sorry you have selected a wrong option");
			break;
}
		sc.close();

	}
}
