package encapsulation;


class login
{
	private String email_id="contact@grotechminds.com";
	public String getEmail_id()
	{
		return email_id;
	}
	
	public void setEmail_id(String email_id)
	{
		this.email_id=email_id;
	}
	
	private String password="Password";
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}


public class Encapsulation1 {

	public static void main(String[] args) {
		
		login l1= new login();
		l1.setEmail_id("nikita@gmail.com");
        System.out.println(l1.getEmail_id());
        l1.setPassword("Nikita");
        System.out.println(l1.getPassword());

	}

}
