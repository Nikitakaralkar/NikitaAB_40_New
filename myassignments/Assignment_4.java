package myassignments;

public class Assignment_4 {

	public static void m1()
	{
		System.out.println("Static method 1");
	}
	
	public static void m2()
	{
		System.out.println("Static method 2");
	}
	
	public static void m3()
	{
		System.out.println("Static method 3");
	}
	
	public static void m4()
	{
		System.out.println("Static method 4");
	}
	
	public static void m5()
	{
		System.out.println("Static method 5");
	}
	

	void a1()
	{
		System.out.println("Non Static method 1");	
	}
	void a2()
	{
		System.out.println("Non Static method 2");	
	}
	void a3()
	{
		System.out.println("Non Static method 3");	
	}
	void a4()
	{
		System.out.println("Non Static method 4");	
	}
	void a5()
	{
		System.out.println("Non Static method 5");	
	}
	public static void main(String[] args) {
		m1();
		m2();
		m3();
		m4();
		m5();
		Assignment_4 a = new Assignment_4();
		a.a1();
		a.a2();
		a.a3();
		a.a4();
		a.a5();
	}

}
