package mypackage;

public class MethodOverload {

	void add()
	{
		System.out.println("Addition");
	}
	
	void add(int a)
	{
		System.out.println(a+6);
	}
	
	void add(int a, double b)
	{
		System.out.println(a+b);
	}
	
	void add(double a, int b)
	{
		System.out.println(a+b);
	}
	
	static void add(String a, int b, double c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	

	public static void main(String[] args) {
	
		add("Nikita",100, 6.01);
		MethodOverload m1 = new MethodOverload();
		//m1.add();
		//m1.add(20);
		m1.add(10, 0.86);
		m1.add(0.9, 8);
		m1.add();
		m1.add(100);
		
		
	

	}

}
//login and registration
//signin and signup
