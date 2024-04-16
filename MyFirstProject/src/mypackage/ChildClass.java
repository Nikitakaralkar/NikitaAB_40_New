package mypackage;
//static and non static methods
//no constructor- can 

class ParentClass
{
	static void parent()
	{
		System.out.println("Parent Class Method");
	}
}
public class ChildClass extends ParentClass {

	static void child()
	{
		System.out.println("Child Class Method");
	}
	
	public static void main(String[] args) {
		
		child();
		parent();
		
	}

}
