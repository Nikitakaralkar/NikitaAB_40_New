package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class One {
	
	
	@Test(priority=2)
	public void login_to_facebook() throws InterruptedException
	{	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("abc@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("abc@gmail.com");
		WebElement loginbtn = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		loginbtn.click();
	
	}
	
	@Test(priority=1)
	public void logout_to_facbook()
	{
		
	}
	

}
