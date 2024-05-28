package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_TestNG {

	
	@DataProvider(name="data1")
	public Object testdata1()
	{
		return new Object[][] {{"shoe"},{"Mobile"},{"Laptop"},{"webcamera"},{"Pencil"},{"Pen"},{"Laptop"},{"tablet"}};
	}
	
	@DataProvider(name="data2")
	public Object testdata2()
	{
		return new Object[][] {{11},{5456},{45},{55},{78},{552},{33},{11}};
	}
	
	@Test(dataProvider="data2")
	public void searching_onAmazon(int input)
{   
	System.out.println(input);
		/* ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys(input);
	search.sendKeys(Keys.ENTER); */
}
}
