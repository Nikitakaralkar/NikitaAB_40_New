package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	    WebElement search = driver.findElement(By.name("q")); 
	    search.sendKeys("shoes");
		Thread.sleep(2000);
		List<WebElement> al= driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		int count = al.size();
		System.out.println(count);
		
		al.get(5).click();

	}

}
