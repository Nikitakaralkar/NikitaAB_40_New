package mypackage;



class Parent_class1
{
	 void add()
	{   
		
		System.out.println("Adding 3 numbers");
		
	}
	
}

public class Final_Method extends Parent_class1 {

	void add()
	{
		//super.add();
		System.out.println("Adding 2 numbers");
		super.add();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Final_Method o1= new Final_Method();
		o1.add();
	}

}
