package mavenPackage.MavenProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ProductPage14 {
	
	
	
	WebDriver driver;
	//Step1
	@FindBy(id ="add-to-wishlist-button-submit")
	WebElement wishlist;
	
	@FindBy(xpath ="//button[@class=' a-button-close a-declarative']")
	WebElement close_button;
	

	@FindBy(xpath ="//input[@id='add-to-cart-button']")
	WebElement add_to_cart;
	
	@FindBy(xpath ="//input[@name='proceedToRetailCheckout']")
	WebElement proceed_to_buy;
	

	
	public void whshlist() throws InterruptedException
	{
		

		wishlist.click();
		Thread.sleep(1000);
		close_button.click();
		
	}
	
	public void cart()
	{
		add_to_cart.click();	
	}
	
	public void click_proceed_to_buy()
	{
		proceed_to_buy.click();	
	}
	
	public Amazon_ProductPage14(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}

