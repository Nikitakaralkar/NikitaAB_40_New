package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Program {
	@DataProvider(name="search_result")
	public Object method1()
	{
		return new Object[][] {{"India"},{"School"},{"Pencil"}};
	}
	
	
	@Test(dataProvider="search_result")
	public void google_search(String input)
{   
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys(input);
	search.sendKeys(Keys.ENTER);
}

}
