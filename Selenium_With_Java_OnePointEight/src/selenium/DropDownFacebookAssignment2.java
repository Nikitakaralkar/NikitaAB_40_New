package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFacebookAssignment2 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Nikita");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Karalkar");
		WebElement mobile  = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("9561124606");
		
		WebElement password_new  = driver.findElement(By.name("reg_passwd__"));
		password_new.sendKeys("abc@123");

		
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select s1= new Select(date);
		s1.selectByVisibleText("4");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s2= new Select(month);
		s2.selectByVisibleText("Mar");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s3= new Select(year);
		s3.selectByVisibleText("1997");
		
		
		WebElement gender_btn  = driver.findElement(By.xpath("//input[@value='1']"));
		gender_btn.click();		
		
		
		WebElement sign_up  = driver.findElement(By.name("websubmit"));
		sign_up.click();		
	

	}

}
