package explicitwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_One {
	
	
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(10));
		//w1.until(ExpectedConditions.titleIs("Google"));
		w1.until(ExpectedConditions.titleContains("Goo"));
		w1.until(ExpectedConditions.alertIsPresent());
		w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//s")));
		
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);

	}

}
