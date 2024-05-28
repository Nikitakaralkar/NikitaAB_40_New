package testng_programs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google_launch_search {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void launch_browser()
	{
		  driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.manage().window().maximize();
		//System.out.println("Launch");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void testcase1()
	{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Nikita");
		search.sendKeys(Keys.ENTER);
	}
	
	@Test
	public void testcase2()
	{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India");
	}

	
	@AfterMethod
	public void close_browser() throws InterruptedException, IOException
	{
		TakesScreenshot t1=       driver ;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\My_Pro\\Selenium_With_Java_OnePointEight\\src\\testng_programs\\sunmoon.png");
		FileHandler.copy(source, destination);
		Thread.sleep(2000);
		driver.quit();

	}


}
