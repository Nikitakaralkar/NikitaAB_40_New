package selenium;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchXpathEnter {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	//WebElement search = driver.findElement(By.xpath("(//input)[5]"));   // Absolute Xpath 
	//search.sendKeys("shoes");
	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));   // Relative Xpath
	Thread.sleep(3000);
	search.sendKeys("shoes");
	search.sendKeys(Keys.ENTER);

	}

}
