package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Google_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> al= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = al.size();
		System.out.println(count);
		
		al.get(count-4).click();
		
		TakesScreenshot t1=       driver ;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\My_Pro\\Selenium_With_Java_OnePointEight\\src\\selenium\\sunmoon.png");
		FileHandler.copy(source, destination);

	}

}
