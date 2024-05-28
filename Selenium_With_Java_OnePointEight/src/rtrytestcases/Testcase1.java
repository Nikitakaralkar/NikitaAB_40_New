package rtrytestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 {
	
	@Test(retryAnalyzer= rtrytestcases.IRA_Program.class)
	public void testcase_for_google()
	{

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement images= driver.findElement(By.linkText("Niki"));
		images.click();
		//Images
	}

}
