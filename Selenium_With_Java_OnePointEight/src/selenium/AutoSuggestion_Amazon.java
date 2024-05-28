package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Amazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")); 
	    search.sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> al= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = al.size();
		System.out.println(count);
		
		al.get(5).click();
		
		
	}

}
