package mavenPackage.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ManageAddress_Page {

	

	WebDriver driver;
	//Step1
	@FindBy(xpath ="(//input[@type='radio'])[1]")
	WebElement select_address;
	

	
	@FindBy(xpath ="(//input[@class='a-button-input'])[2]")
	WebElement use_this_address;
			
			
			
			public void click_select_address()
			{
				select_address.click();	
			}
			
			
			public void click_use_this_address()
			{
				use_this_address.click();	
			}
			
			
			public Amazon_ManageAddress_Page(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
}
