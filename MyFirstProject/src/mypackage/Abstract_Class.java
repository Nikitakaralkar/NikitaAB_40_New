package mypackage;

abstract class Google_Code
{
	
	abstract void login();
	abstract void registration();

	
}

public class Abstract_Class extends Google_Code{

	public static void main(String[] args) {
		

		Abstract_Class a1= new Abstract_Class();
		a1.login();
		a1.registration();
	}

	
	void login() 
	{
		System.out.println("Login Logic");
		
	}

	
	void registration() 
	{
		System.out.println("Registration Logic");
		
	}

}
