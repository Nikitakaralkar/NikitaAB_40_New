package mypackage;

class Dataprovider
{
	void username()
	{
		
	}
	
	void password()
	{
		
	}
}


public class LoginToAmazon extends Dataprovider{
	
	void login_button()
	{
		
	}

	public static void main(String[] args) {
	
     Dataprovider d1= new LoginToAmazon();   //upcating
		d1.username();
		d1.password();
		
		LoginToAmazon a2= (LoginToAmazon) d1;    //downcating- only explicit
		 a2.username();
		 a2.password();
		 a2.login_button();
 
	}

}
