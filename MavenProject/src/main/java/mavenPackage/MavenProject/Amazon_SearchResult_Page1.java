package mavenPackage.MavenProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_SearchResult_Page1 {
	
	
	WebDriver driver;
	//Step1
	@FindBy(xpath = "(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
			
			//"//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div[2]/div[2]/h2/a/span")
	WebElement firstproduct_click;
	
	
	@FindBy(xpath ="(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[2]")
	WebElement sort_by_days;
	
	@FindBy(xpath="(//a[@class='a-link-normal s-navigation-item'])[13]")
	WebElement sort_by_4star;
	
	@FindBy(xpath="//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']")
	WebElement hoverover_Accounts_Links;
	
	@FindBy(linkText="Sign Out")
	WebElement sign_out;
	
	
	public void click_product(WebDriver driver) throws InterruptedException
	{
		firstproduct_click.click();
		
		String pid= driver.getWindowHandle();
		 Set<String> cid= driver.getWindowHandles();
		 System.out.println(pid);
		 System.out.println(cid);

		 Iterator<String> pc= cid.iterator();
		 String parentid = pc.next();
		 String childid = pc.next();
		 System.out.println(parentid);
		 System.out.println(childid);
		 Thread.sleep(2000);
		 driver.switchTo().window(childid);
		
		
	}
	
	public void click_sort_by_days() throws InterruptedException
	{
		Thread.sleep(1000);
		sort_by_days.click();
	}
	
	public void click_sort_by_4stars()
	{
		sort_by_4star.click();
	}
	
	public void logout(WebDriver driver) throws InterruptedException
	{
		
		  Actions a1 = new Actions(driver);
		  a1.moveToElement(hoverover_Accounts_Links).perform();
		  Thread.sleep(1000);
		  sign_out.click();
		  

	}
	
	public Amazon_SearchResult_Page1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	
	
	
}
