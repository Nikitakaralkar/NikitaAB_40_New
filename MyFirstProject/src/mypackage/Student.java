package mypackage;

class Mentor
{
	Mentor()
	{
		System.out.println("Mentor Class Constructors");
	}
}



public class Student extends Mentor {  //only Student class will have main methid as it is visible in our tree.
	
	
	Student()
	{
		System.out.println("Student Class Constructors");
	}
	
	public static void main(String[] args) {
		
	Student s1= new	Student();
	}
	

}

