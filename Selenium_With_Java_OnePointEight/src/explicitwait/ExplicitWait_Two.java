package explicitwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Two {

	public static void main(String[] args) {
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		WebElement search = driver.findElement(By.xpath("//button[@class='btnjs']"));
		search.click();
		WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		w1.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();
		//search.sendKeys("India");
		//search.sendKeys(Keys.ENTER);


	}

}
