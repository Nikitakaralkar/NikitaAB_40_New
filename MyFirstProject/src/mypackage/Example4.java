package mypackage;

public class Example4 {
	
	Example4()
	{
		System.out.println("Constructor");
	}
 
	public static void add()
	{
		int a=20;
		int b=30;
		int sum =a+b;
		System.out.println(sum);
	}
	
	void multi()
	{
		int a=20;
		int b=30;
		int mul =a*b;
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		Example4 e1 = new Example4();
		e1.multi();
		
	}

}
