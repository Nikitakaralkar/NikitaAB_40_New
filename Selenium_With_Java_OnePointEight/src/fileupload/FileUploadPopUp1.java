package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp1 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		  driver.get("https://grotechminds.com/registration/");
		  //driver.manage().window().maximize();
		  WebElement element = driver.findElement(By.xpath("//input[@id='file']"));
		  //element.click();
		  element.sendKeys("D:\\Pictures\\1625591750549.jpg");
		  

	}

}
