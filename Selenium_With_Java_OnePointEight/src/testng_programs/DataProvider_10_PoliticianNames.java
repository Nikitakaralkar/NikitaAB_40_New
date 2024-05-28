package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_10_PoliticianNames {

	
	@DataProvider(name="search_result")
	public Object testdata1()
	{
	     Object l1 [][]= new Object[10][1]; // 5 set of values and 2- user name and pwd
	     l1[0][0]="Amit Shah";
	    
	     l1[1][0]="S. Jaishankar";
	     
	     l1[2][0]="Narendra Modi";
	     
	     /* l1[3][0]="Rajnath Singh";
	     
	     l1[4][0]="Yogi Adityanath";
	     
	     l1[5][0]="Rahul Gandhi";
	     l1[6][0]="Arvind Kejriwal";
	     l1[7][0]="Mamta Banerjee";
	     l1[8][0]="Sonia Gandhi";*/
	     l1[9][0]="Nitish Kuma";
	   
	     return l1;
	     
	}
	
	
	@Test(dataProvider="search_result")
	public void google_search(String input)
{   
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys(input);
	search.sendKeys(Keys.ENTER);
	WebElement overview_field = driver.findElement(By.xpath("(//span[.='Overview'])[2]"));
	boolean chk_overview = overview_field.isDisplayed();
	Assert.assertEquals(chk_overview, true);
	driver.quit();
}
}