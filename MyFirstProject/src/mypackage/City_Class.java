package mypackage;

class State_Class
{
	static void multiple()
	{
		System.out.println("multiple");
	}
	
	void division()
	{
		System.out.println("divide");
	}
}



public class City_Class extends State_Class{

	static void add()
	{
		System.out.println("adding");
	}
	
	void subtacting()
	{
		System.out.println("subtraction");
	}
	public static void main(String[] args) {
		
     add();
     multiple();
     City_Class c1= new City_Class();
     c1.subtacting();
     c1.division();
	}
	
}


