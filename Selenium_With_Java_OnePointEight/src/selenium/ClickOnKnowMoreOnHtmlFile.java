package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnKnowMoreOnHtmlFile {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/learningHTML1.html");
	    WebElement knowmore= driver.findElement(By.tagName("a"));
	    knowmore.click();
	}

}
