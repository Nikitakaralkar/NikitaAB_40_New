package mavenPackage.MavenProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testcase3_Login_to_Payments extends LaunchQuit {

	

	@Test
	public void login_to_amazon_till_payments() throws InterruptedException
	{
	
		
		
		Amazon_Login_Page l1= new Amazon_Login_Page(driver);
		//l1.click_signin(driver);
		l1.un();
		l1.cnt();
		l1.pwd();
		l1.signin();
		
		Amazon_Home_Page s1= new Amazon_Home_Page(driver);
		s1.search();
		
		Amazon_SearchResult_Page1 p1= new Amazon_SearchResult_Page1(driver);
		p1.click_product(driver);
		
		Amazon_ProductPage14 c= new Amazon_ProductPage14(driver);

		c.whshlist();
		Thread.sleep(1000);
		c.cart();  
		c.click_proceed_to_buy();
		
		Amazon_ManageAddress_Page a1= new Amazon_ManageAddress_Page(driver);
		a1.click_select_address();
		a1.click_use_this_address();
		
	
}
}
