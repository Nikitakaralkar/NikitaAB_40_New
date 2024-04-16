package mypackage;

public class Second {

	static void add()
	{   
		int a=10;
		int b=30;
		int sum=a+b;
				
		System.out.println(sum);
	}
	static void substract()
	{
		int a1=50;
		int a2=20;
		int sub=a1-a2;
		System.out.println(sub);
		
	}
	static void multiply()
	{
		int x=20;
		int y=30;
		int mul=x*y;
				
		System.out.println(mul);
	}
	static void divide()
	{
		int n1=500;
		int n2=5;
		int div=n1/n2;
				
		System.out.println(div);
	}
	public static void main(String[] args) //main method
	{
		add();
		substract();
		multiply();
		divide();
    }
}
