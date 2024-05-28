package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Keys_Functionality_Assignment3_Amazon {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement cate_dd = driver.findElement(By.id("searchDropdownBox"));
		for(int i=1;i<=10;i++)
		{

			{ 
				cate_dd.sendKeys(Keys.ARROW_DOWN);
				
			}
			cate_dd.sendKeys(Keys.ENTER);
		
		}
		
		
	
		

	}

}
