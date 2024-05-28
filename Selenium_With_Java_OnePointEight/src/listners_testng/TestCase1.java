package listners_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;



@Listeners(ITestListner_Program.class)
public class TestCase1 extends ITestListner_Program {

	
	 ChromeDriver driver;
	@Test

	public void test_case_drag_drop() 
	{
		
		 driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		// driver.manage().window().maximize();
		WebElement drag_element = driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		WebElement drop_element = driver.findElement(By.xpath("//div[@id='div2']"));

		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag_element, drop_element).perform();
		//Assert.assertTrue(false);
	}

}
