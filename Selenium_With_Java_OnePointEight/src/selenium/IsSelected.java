package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/learningHTML1.html");
        WebElement un= driver.findElement(By.xpath("(/html/body/input)[1]"));
        un.sendKeys("nikita");
        WebElement maleradio = driver.findElement(By.xpath("(/html/body/input)[4]"));
        maleradio.click();
        
        WebElement password = driver.findElement(By.xpath("(//input)[3]"));
        password.sendKeys("abc");	
        
        WebElement lastname = driver.findElement(By.name("lname"));
        System.out.println(lastname.isDisplayed());
        System.out.println(lastname.isEnabled());
        
        WebElement boy_checkbox = driver.findElement(By.name("name1"));
        boolean b1 = boy_checkbox.isSelected();
        if(b1==false)
        {
        	boy_checkbox.click();
        }
	}

}
