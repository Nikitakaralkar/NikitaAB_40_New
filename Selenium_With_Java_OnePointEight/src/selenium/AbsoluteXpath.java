package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/learningHTML1.html");
        WebElement un= driver.findElement(By.xpath("(/html/body/input)[1]"));
        un.sendKeys("nikita");
        WebElement maleradio = driver.findElement(By.xpath("(/html/body/input)[4]"));
        maleradio.click();
        
        WebElement password = driver.findElement(By.xpath("(//input)[3]"));
        password.sendKeys("abc");	
        
        WebElement hint = driver.findElement(By.xpath("/html/body/input[2]"));
        hint.sendKeys("Hint");
        
        WebElement firstname = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
        firstname.sendKeys("Nikita");
        Thread.sleep(3000);
        
        //WebElement lastname = driver.findElement(By.xpath("(/html/body/form/input)[2]"));
        //lastname.sendKeys("Karalkar");
        
        		
        //WebElement submitbtn = driver.findElement(By.xpath("(/html/body/form/input)[3]"));
        //submitbtn.click();
        
        WebElement haveboycheckbox = driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
        haveboycheckbox.click();
        
       
        WebElement relocate  = driver.findElement(By.xpath("/html/body/input[6]"));
        		relocate .click();
        		
       
	
	}
	
	

}
