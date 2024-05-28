package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScreenShot1 {

	public static void main(String[] args) throws InterruptedException, IOException {


		ChromeDriver driver=new 	ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search=	driver.findElement(By.name("q"));
		search.sendKeys("bangalore");
		Thread.sleep(4000);
		List<WebElement> a1=		driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		
		int count=	a1.size();
		System.out.println(count);
		
		a1.get(count-4).click();
		/* TakesScreenshot t1=       driver ;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\My_Pro\\Selenium_With_Java_OnePointEight\\src\\selenium\\sunmoon.png");
		FileHandler.copy(source, destination); */
		
		   Date currentTime = new Date();
	        long timestamp = currentTime.getTime();

	        // Convert timestamp to human-readable format
	        String formattedTime = new Date(timestamp).toString().replace(":", "-");

		TakesScreenshot	 t1=					driver;
		File source=			t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\My_Pro\\Selenium_With_Java_OnePointEight\\src\\selenium\\"+new GetScreenShot1().getClass()   +Math.random()+ formattedTime +".png");
		FileHandler.copy(source, destination);
		

	}

}
