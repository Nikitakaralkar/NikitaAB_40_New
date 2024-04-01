package myassignments;

abstract class Parent1
{
	abstract void add();
	abstract void sub();
	
	void m1()
	{
		System.out.println("Non-Static Concerte Method - From Parent1");
	}
}

abstract class Parent2 extends Parent1
{
	abstract void multiply();
	abstract void divide();
	
	static void m2()
	{
		System.out.println("Static Concerte Method - From Parent2");
	}
}
public class Abstract_Class_Assignment_16  extends Parent2{

	void a1()
	{
		System.out.println("Non-Static Concerte Method 1 - From Child Class");
	}
	
	void a2()
	{
		System.out.println("Non-Static Concerte Method 2 - From Child Class");
	}
	
	
	void multiply() {
		System.out.println("Abstract Method - Multiply");
	}

	void divide() {
		System.out.println("Abstract Method - divide");
	}

	void add() {
		System.out.println("Abstract Method - Add");
	}

	void sub() {
		System.out.println("Abstract Method - Subtract");
	}
	
	public static void main(String[] args) {
		
		Abstract_Class_Assignment_16 a = new Abstract_Class_Assignment_16();
		a.add();
		a.sub();
		a.multiply();
		a.divide();
		a.m1();
		m2();
		a.a1();
		a.a2();
	}

}

