package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonAssignment_On_Assertion {

	WebDriver driver;
	@Test
	public void testcase1() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	//WebElement search = driver.findElement(By.xpath("(//input)[5]"));   // Absolute Xpath 
	//search.sendKeys("shoes");
	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));   // Relative Xpath
	Thread.sleep(3000);
	search.sendKeys("shoes");
	search.sendKeys(Keys.ENTER);
	WebElement shoe1= driver.findElement(By.xpath("//span[.='Mens Champion Road Running Sports Shoes | Lightweight & Sungfit For An Energetic Ride']"));
	//System.out.println(shoe1Price);
	shoe1.click();
	
	WebElement shoe1price= driver.findElement(By.xpath("//span[.='1,699']"));
String price1 = shoe1price.getText();
String price2 = shoe1price.getText();

int value1= Integer.parseInt(price1);  
	//shoe1.click();
	}
}
