package mavenPackage.MavenProject;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Testcase1_Login_to_Cart extends LaunchQuit {

	
	
	@Test(retryAnalyzer= mavenPackage.MavenProject.RetryAnalyzer_Class.class)
	public void login_to_amazon_till_cart() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		Amazon_Login_Page l1= new Amazon_Login_Page(driver);
		DataFetching.testdata();
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
		
		
	}

	
}
