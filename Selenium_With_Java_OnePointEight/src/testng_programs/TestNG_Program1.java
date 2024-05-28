package testng_programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Program1 {
	
	WebDriver driver;
	@Test
	
	@Parameters("browser")
	public void launch_browser(String nameofbrowser) throws InterruptedException
	{
		if(nameofbrowser.equals("chrome"))
		{
		driver= new ChromeDriver();
		}
		
		//if(nameofbrowser.equals("firefox"))
		//{
		//driver= new FirefoxDriver();
		//}
		
		if(nameofbrowser.equals("edge"))
		{
		driver= new EdgeDriver();
		}
		
		/* driver.get("https://www.google.com");
		WebElement e1= driver.findElement(By.name("q"));
		e1.sendKeys("India");
		e1.sendKeys(Keys.ENTER); */
		
		 driver.get("https://www.amazon.in/");
		  //driver.manage().window().maximize();
		  WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));   // Relative Xpath
		  Thread.sleep(3000);
		  search.sendKeys("shoes");
		  search.sendKeys(Keys.ENTER);
		  WebElement firstshoes = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		 firstshoes.click();
		  String pid= driver.getWindowHandle();
		 Set<String> cid= driver.getWindowHandles();
		 System.out.println(pid);
		 System.out.println(cid);

		 Iterator<String> pc= cid.iterator();
		 String parentid = pc.next();
		 String childid = pc.next();
		 System.out.println(parentid);
		 System.out.println(childid);
		 Thread.sleep(2000);
		 driver.switchTo().window(childid);
		 //driver.close();
		 WebElement buynow= driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		 buynow.click();
		 driver.findElement(By.name("email")).sendKeys("9561124606");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("Activadio@43");
			driver.findElement(By.id("signInSubmit")).click();
		
		
		

		
	}

}
