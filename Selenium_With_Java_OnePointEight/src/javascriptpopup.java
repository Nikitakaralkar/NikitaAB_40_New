import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptpopup {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		WebElement okbtn =driver.findElement(By.xpath("//button[.='Click ']"));
		okbtn.click();  // birth to javascript popup
		driver.switchTo().alert().accept(); //handled the javascript popup
		Thread.sleep(2000);
	}

	}

