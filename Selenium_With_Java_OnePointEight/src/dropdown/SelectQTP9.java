package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectQTP9 {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement drop_down8= driver.findElement(By.id("Choice8"));
		//drop_down9.click();
		Select s1= new Select(drop_down8);
		s1.selectByVisibleText("QTP9");
		
		WebElement drop_down4= driver.findElement(By.id("Choice4"));
		Select s2= new Select(drop_down4);
		s2.selectByVisibleText("Energy14");
	}

}
