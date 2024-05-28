package ab40testfacebook;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ab40sourcefacebook.Facebook_Login_Page;

public class TestCase1 {
	
	@Test
	public void login_to_facebook()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		Facebook_Login_Page f1= new Facebook_Login_Page(driver);
		f1.un();
		f1.pwd();
		f1.login();
		
	}

}
