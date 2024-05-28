package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage_Keys_ctrlc {

	public static void main(String[] args) {



		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fristname = driver.findElement(By.id("fname"));
		fristname.sendKeys("nikita");
		fristname.sendKeys(Keys.CONTROL+"a");
		fristname.sendKeys(Keys.CONTROL+"c");
		WebElement lastname = driver.findElement(By.id("lname"));
		lastname.sendKeys(Keys.CONTROL+"v");

	}

}
