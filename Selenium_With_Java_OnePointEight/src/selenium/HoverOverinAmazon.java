package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOverinAmazon {

	public static void main(String[] args) {

  ChromeDriver driver = new ChromeDriver();
  driver.get("https://www.amazon.in");
  WebElement e1 = driver.findElement(By.id("nav-link-accountList"));
  
  Actions a1 = new Actions(driver);
  a1.moveToElement(e1).perform();
  

	}

}
