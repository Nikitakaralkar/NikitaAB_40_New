package mypackage;

public class ConstructorOverload {

	ConstructorOverload(int a) 
	{
		System.out.println("1");
	}
	
	ConstructorOverload(double a)
	{
		System.out.println("2");
		System.out.println(a);
	}
	
	public ConstructorOverload() 
	{
		System.out.println("3");
		
	}
	

	
	
	public static void main(String[] args) 
	{
		
	ConstructorOverload c1= new ConstructorOverload(); //One object for 1 Constructor
	new ConstructorOverload(65.22);
	new ConstructorOverload(2);


	}

}
