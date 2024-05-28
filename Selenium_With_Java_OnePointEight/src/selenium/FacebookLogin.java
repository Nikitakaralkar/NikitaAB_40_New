package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {



ChromeDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("nikk4397@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Activadio@43");
driver.findElement(By.name("login")).click();

	}

}
