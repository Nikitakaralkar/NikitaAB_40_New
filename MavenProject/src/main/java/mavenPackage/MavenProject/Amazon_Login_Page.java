package mavenPackage.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_Page extends DataFetching {
	
	
	
	
	//WebDriver driver;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement hoverover_Accounts_Links;
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")
	WebElement sign_in;
	
	
	
	//Step1
	@FindBy(name="email")
	WebElement un_tf;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(name="password")
	WebElement pwd_tf;
	
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	
	
	
	
	//step2
	public void click_signin(WebDriver driver) throws InterruptedException
	{
		
		Thread.sleep(3000);
		 Actions a1 = new Actions(driver);
		  a1.moveToElement(hoverover_Accounts_Links).perform();
		  
	      sign_in.click();
	}
	
	
	
	public void un()
	{
		un_tf.sendKeys(username);
	}
	
	public void cnt()
	{
		continue_button.click();
	}
	
	public void pwd()
	{
		pwd_tf.sendKeys(password);
	}
	public void signin()
	{
		signin_button.click();
	}
//Step 3
	
	public Amazon_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
