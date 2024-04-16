package mypackage;

public class Assignment6 {

	static
	{
		System.out.println("Static block");
	}
	
	{
		System.out.println("IIB");
	}
	
	public Assignment6() 
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args) 
	{
		
		System.out.println("Main Method");
		
		Assignment6 o = new Assignment6();
		Assignment6 o1 = new Assignment6();
		
	}

}
