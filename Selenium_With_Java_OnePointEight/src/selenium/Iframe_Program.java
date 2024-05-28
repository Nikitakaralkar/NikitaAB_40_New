package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		WebElement e1 = find
		
		
		driver.switchTo().frame(e1);
		
		// to out of the iframe
		driver.switchTo().defaultContent();
		

	}

}
