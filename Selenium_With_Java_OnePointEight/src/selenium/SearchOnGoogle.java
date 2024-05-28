package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchOnGoogle {

	public static void main(String[] args) {

ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("India");
driver.findElement(By.name("btnK")).click();

	}

}
