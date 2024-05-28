package mavenPackage.MavenProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page {
	
	WebDriver driver;
	//Step1
	@FindBy(xpath ="//input[@id='twotabsearchtextbox']")
	WebElement search;
	
	
	
	
	
	public void search()
	{
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
	}
	
	public Amazon_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
