package myassignments;

public class Assignment5 {
	
	public Assignment5(int i)
	{
		System.out.println("Constructor 1");
	}
	public Assignment5(char c)
	{
		System.out.println("Constructor 2");
	}
	public Assignment5(String s)
	{
		System.out.println("Constructor 3");
	}
	public Assignment5(boolean b)
	{
		System.out.println("Constructor 4");
	}
	public Assignment5(int a, boolean b1, String s1  )
	{
		System.out.println("Constructor 5");
	}
	
	public static void main(String[] args) {
		
		new Assignment5(20);
		new Assignment5('N');
		new Assignment5("Nikita");
		new Assignment5(false);
		new Assignment5(30, true,"ABC");
	}

}
