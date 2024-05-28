package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.id("nav-link-accountList")).click();

	driver.findElement(By.name("email")).sendKeys("9561124606");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Activadio@43");
	driver.findElement(By.id("signInSubmit")).click();
	
	
	}

}
