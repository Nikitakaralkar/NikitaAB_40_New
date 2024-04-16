package mypackage;

public class Seventh_March {

	int age;
	String name;
	double salary;
	void student_details(String name, int age, double salary)
	{
		System.out.println("I am " +name + "and my age is" +age + "and my salary is" +salary);
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	
	public static void main(String[] args) {
		
		Seventh_March s1 = new Seventh_March();
		s1.student_details("Nikita", 25, 75000.1);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.salary);

	}

}
