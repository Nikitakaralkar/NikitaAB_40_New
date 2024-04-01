package myassignments;

class Parent_class
{
	void add()
	{   
		
		System.out.println("Adding 3 numbers");
		
	}
	
}

public class Method_Override extends Parent_class {

	void add()
	{
		//super.add();
		System.out.println("Adding 2 numbers");
		super.add();
	}
	
	public static void main(String[] args) {
		
	Method_Override o1= new Method_Override();
	o1.add();
	
	
	}

}
