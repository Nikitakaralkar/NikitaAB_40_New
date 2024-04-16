package mypackage;

abstract class Facebook_Class
{
	void add()  // concrete method 1
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	static void subtract() // concrete method 2
	{
		System.out.println(Math.subtractExact(10,20));
	}
	
	abstract void multiply();  //abstract method 1
	abstract void divide();      //abstract method 1
	
}


public class Abstract_Class1 extends Facebook_Class {

	void modulus()
	{
		
	}
	
	@Override
	void multiply() {
		System.out.println("multiply method");
		
	}
	@Override
	void divide() {
		System.out.println("divide method");
		
	}

	public static void main(String[] args) {
		
     Abstract_Class1 a1= new Abstract_Class1();
     a1.add();
     subtract();
     a1.multiply();
     a1.divide();
		
	}
	
}

