package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLogin_DataProvider {
	
	@DataProvider(name="data1")
	public Object testdata1()
	{
	     Object l1 [][]= new Object[5][2]; // 5 set of values and 2- user name and pwd
	     l1[0][0]="ram@gmial.com";
	     l1[0][1]="ram";
	     
	     l1[1][0]="sham@gmial.com";
	     l1[1][1]="sham";
	     
	     l1[2][0]="nikita@gmial.com";
	     l1[2][1]="nikita";
	     
	     l1[3][0]="sita@gmial.com";
	     l1[3][1]="sita";
	     
	     l1[4][0]="abc@gmial.com";
	     l1[4][1]="abc";
	     
	     return l1;
	     
	}
	
	
	@Test(dataProvider="data1")
	public void login_To_Facebook(String UN, String PWD)
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
	username.sendKeys(UN);
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys(PWD);
	WebElement loginbtn = driver.findElement(By.xpath("//button[@id='loginbutton']"));
	loginbtn.click();
	Reporter.log("Log in was attempted, not sure if it's logded in please check exception");
	}


}
