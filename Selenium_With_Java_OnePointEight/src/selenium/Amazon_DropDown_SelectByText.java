package selenium;

import java.time.Duration;
import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_DropDown_SelectByText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search= driver.findElement(By.id("searchDropdownBox"));
		//search.click();
		Select s1= new Select(search);
		s1.selectByVisibleText("Amazon Devices");
		List<WebElement> sizeofDropDown= s1.getOptions();
		System.out.println(sizeofDropDown.size());

	}

}
