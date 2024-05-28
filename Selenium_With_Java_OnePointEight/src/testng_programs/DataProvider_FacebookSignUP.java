package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_FacebookSignUP {
	
	
	@DataProvider(name="data1")
	public Object testdata1()
	{
	     Object l1 [][]= new Object[5][4]; // 5 set of values and 2- user name and pwd
	     l1[0][0]="ram@gmial.com";
	     l1[0][1]="ram";
	     l1[0][2]="3212121";
	     l1[0][3]= "pp";		 
	     
	     l1[1][0]="sham@gmial.com";
	     l1[1][1]="sham";
	     l1[1][2]="3221";
	     l1[1][3]= "p";	
	     
	     l1[2][0]="nikita@gmial.com";
	     l1[2][1]="nikita";
	     l1[2][2]="32121";
	     l1[2][3]= "pssp";	
	     
	     l1[3][0]="sita@gmial.com";
	     l1[3][1]="sita";
	     l1[3][2]="44";
	     l1[3][3]= "pddddp";	
	     
	     l1[4][0]="abc@gmial.com";
	     l1[4][1]="abc";
	     l1[4][2]="32121";
	     l1[4][3]= "vvv";	
	     
	     return l1;
	     
	}
	
	
	@Test(dataProvider="data1")
	public void login_To_Facebook(String FirstName, String LastName, String MOBILE, String NewPWD)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys(FirstName);
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys(LastName);
		WebElement mobile  = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys(MOBILE);
		
		WebElement password_new  = driver.findElement(By.name("reg_passwd__"));
		password_new.sendKeys(NewPWD);

		
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select s1= new Select(date);
		s1.selectByVisibleText("4");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s2= new Select(month);
		s2.selectByVisibleText("Mar");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s3= new Select(year);
		s3.selectByVisibleText("1997");
		
		WebElement gendes4 = driver.findElement(By.xpath("//input[@value='1']"));
	    gendes4.click();
	    
		
		WebElement signup_btn = driver.findElement(By.xpath("//button[@name='websubmit']"));
		signup_btn.click();
	
		
	Reporter.log("Log in was attempted, not sure if it's logded in please check exception");
	}

}
