package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchNaukri {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.name("google-register")).click();
	


	}

}
