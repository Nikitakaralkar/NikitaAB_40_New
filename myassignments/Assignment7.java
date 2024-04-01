package myassignments;

import java.util.Scanner;

public class Assignment7 {

	static void add()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter two no's to add");
		int a= sc1.nextInt();
		int b= sc1.nextInt();
		int sum = a+b;
		System.out.println("Sum is:" +sum);
	}
	static void sub()
	{
		Scanner sc2 = new Scanner(System.in);	
		System.out.println("Enter two no's for subtraction");
		int a1= sc2.nextInt();
		int b1= sc2.nextInt();
		int sub = a1-b1;
		System.out.println("Subtraction:" +sub);
	}
	static void mul()
	{
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter two no's for multiplication");
		int a3= sc3.nextInt();
		int b3= sc3.nextInt();
		int mul = a3*b3;
		System.out.println("multiplication:" +mul);
	}
	static void div()
	{
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter two no's for division");
		int a= sc4.nextInt();
		int b= sc4.nextInt();
		int div = a/b;
		System.out.println("Division:" +div);
	}
	static void mod()
	{
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Enter two no's to get modulus");
		int a= sc5.nextInt();
		int b= sc5.nextInt();
		int mod = a%b;
		System.out.println("Modulus:" +mod);
	}
	
	public static void main(String[] args) {
	
		add();
        sub();
        mul();
        div();
        mod();
        	}
	}
