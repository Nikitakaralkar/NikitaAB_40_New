package mavenPackage.MavenProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testcase2_Login_sort_Logout extends LaunchQuit {
	
	
	
		@Test
		public void login_to_amazon_till_logout() throws InterruptedException
		{
		
			
			Amazon_Login_Page l1= new Amazon_Login_Page(driver);
			l1.un();
			l1.cnt();
			l1.pwd();
			Thread.sleep(500);
			l1.signin();
			
			Amazon_Home_Page s1= new Amazon_Home_Page(driver);
			s1.search();
			
		
		Amazon_SearchResult_Page1 r1= new Amazon_SearchResult_Page1(driver);
		r1.click_sort_by_days();
		Thread.sleep(1000);
		r1.click_sort_by_4stars();
		Logout lg1= new Logout(driver);
		lg1.hoverover(driver);
		lg1.logout(driver);
		
	}


}
