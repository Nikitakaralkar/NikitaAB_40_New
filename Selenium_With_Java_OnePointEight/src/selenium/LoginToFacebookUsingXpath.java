package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFacebookUsingXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("abc@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("abc@gmail.com");
		WebElement loginbtn = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		loginbtn.click();

		

		

	}

}
