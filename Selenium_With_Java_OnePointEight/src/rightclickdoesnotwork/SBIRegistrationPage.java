package rightclickdoesnotwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SBIRegistrationPage {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		  driver.get("https://retail.onlinesbi.sbi/retail/newuserreg.htm");
		  
		WebElement New_user_regi= driver.findElement(By.xpath("//select[@name='issueCode']"));
		Select s3= new Select(New_user_regi);
		  s3.selectByVisibleText("New User Registration"); 
		  
		  Thread.sleep(3000);
		  
		  WebElement btn_next = driver.findElement(By.id("nextStep"));
		  btn_next.click();
		  
		  Thread.sleep(3000); 
		  WebElement ac_no = driver.findElement(By.id("accountNo"));
		  ac_no.sendKeys("767676767");
		  
		  WebElement cif_no = driver.findElement(By.id("cifNo"));
		  cif_no.sendKeys("677767");
		  
		  WebElement branch_code = driver.findElement(By.id("branchCode"));
		  branch_code.sendKeys("677767");
		  
		  WebElement country = driver.findElement(By.id("selCountry"));
		  Select s1= new Select(country);
		  s1.selectByIndex(1);
		  
		  WebElement mobile_no = driver.findElement(By.id("mobileNo"));
		  mobile_no.sendKeys("9565566");
		  
		  WebElement facility_req = driver.findElement(By.id("txnRights"));
		  Select s2= new Select(facility_req);
		  s1.selectByIndex(1);
		  
		  
		  WebElement i_agree = driver.findElement(By.id("iAgreeconsent"));
		  i_agree.click();
		  
		 

		

	}

}
