package mypackage;

public class GlobalVariable2 {

	
	static int a=100 ;
	static int b=200 ;
	
	static void add()
	{
		System.out.println(a+b);
	}
	static void sub()
	{
		System.out.println(a-b);
	}
	
	static void mul()
	{
		System.out.println(a*b);
	}
	static void div()
	{
		System.out.println(a/b);	
	}
	
	
	public static void main(String[] args) {
		
   add();
   sub();
   mul();
   div();
	}

}
