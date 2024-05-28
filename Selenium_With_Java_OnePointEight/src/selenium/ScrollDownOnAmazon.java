package selenium;

//import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownOnAmazon {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	//WebElement search = driver.findElement(By.xpath("(//input)[5]"));   // Absolute Xpath 
	//search.sendKeys("shoes");
	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));   // Relative Xpath
	Thread.sleep(3000);
	search.sendKeys("shoes");
	search.sendKeys(Keys.ENTER);
	
	WebElement e1= driver.findElement(By.linkText("COVID-19 and Amazon"));
	
    Point p1= e1.getLocation();
	int x = p1.getX();
	int y= p1.getY();
	System.out.println(x);
	System.out.println(y);
	
	JavascriptExecutor js1 =                 driver;
	js1.executeScript("window.scrollBy(0,"+y+")");
	Thread.sleep(2000);
	js1.executeScript("window.scrollBy(0,-2000)");
	}

}
