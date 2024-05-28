package ab40sourcefacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login_Page {

	WebDriver driver;
	//Step 1
	@FindBy(id="email")
	WebElement un_tf;
	
	@FindBy(name="pass")
	WebElement pwd_tf;
	
	@FindBy(xpath="//button[@name='login']") 
	WebElement login_button;
	
	//Step 2 -create seperate method forech component
	public void un()
	{
		un_tf.sendKeys("nikk4397@gmail.com");
	}
	
	public void pwd()
	{
		pwd_tf.sendKeys("Activadio@43");
	}
	
	public void login()
	{
		login_button.click();
	}
	
	public Facebook_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
