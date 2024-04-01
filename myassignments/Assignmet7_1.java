package myassignments;

import java.util.Scanner;

public class Assignmet7_1 {

   int a;
   int b;
	
	 void add()
	{   int sum = a+b;
		System.out.println("Sum is:" +sum);
	}
	void sub()
	{   int sub = a-b;
		System.out.println("Subtraction:" +sub);
	}
	void mul()
	{   int mul = a*b;
		System.out.println("multiplication:" +mul);
	}
	void div()
	{   int div = a/b;
		System.out.println("Division:" +div);
	}
	 void mod()
	{   int mod = a%b;
		System.out.println("Modulus:" +mod);
	}
	public static void main(String[] args) {
		
		 Scanner sc1 = new Scanner(System.in);
		Assignmet7_1 as = new Assignmet7_1();
		System.out.println("Enter two no's to perform operations");
		as.a= sc1.nextInt();
		as.b= sc1.nextInt();
		sc1.close(); 
		//Assignmet7_1 as = new Assignmet7_1();
		as.add();
		as.sub();
		as.mul();
		as.div();
		as.mod();
	}

}
