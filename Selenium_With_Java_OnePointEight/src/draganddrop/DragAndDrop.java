package draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		  driver.get("https://grotechminds.com/drag-and-drop/");
		  //driver.manage().window().maximize();
		  WebElement drag_element = driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		  WebElement drop_element = driver.findElement(By.xpath("//div[@id='div2']"));
		  
		  Actions a1 = new Actions(driver);
		  a1.dragAndDrop(drag_element, drop_element).perform();
	}

}
