package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAmazonAssignment1 {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement cate_dd = driver.findElement(By.id("searchDropdownBox"));
		Select s1 =new Select(cate_dd);
		//s1.selectByIndex(2);
		//s1.selectByValue("search-alias=luggage");
		s1.selectByVisibleText("Books");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("world war");
		
		WebElement search_btn = driver.findElement(By.id("nav-search-submit-button"));
		search_btn.click();

	}

}
