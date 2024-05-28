package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazonSignIn {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	driver.findElement(By.linkText("Customer Service")).click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Your Orders")).click();
	driver.findElement(By.name("email")).sendKeys("9561124606");
	
	driver.findElement(By.id("ap_password")).sendKeys("Activadio@43");
	driver.findElement(By.id("signInSubmit")).click();
	
		
	}

}
