package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gmail {

	//public static void main(String[] args) {
	
	@Test
	public void testcase1() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	driver.findElement(By.linkText("Gmail")).click();
	WebElement presenceofcomponent1= driver.findElement(By.xpath("(//div[@class='dropdown__label'])[1]"));
	//Assert.assertEquals(driver.getTitle(), "Gmail: Private and secure email at no cost | Google Workspace", "Titles are not matching");
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/gmail/about/", "Titles are not matching");
	
Assert.assertTrue(presenceofcomponent1.isDisplayed());
	}

}
