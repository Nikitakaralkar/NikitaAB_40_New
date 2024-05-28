package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertion_test {

	
	 WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        // Set the path of chromedriver.exe in your system
	      
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://www.example.com");
	    }

	    @Test(priority = 1)
	    public void pageTitleTest() {
	        String expectedTitle = "Example Domain";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Page title is not as expected");
	    }

	    @Test(priority = 2)
	    public void pageHeaderTest() {
	        WebElement header = driver.findElement(By.xpath("//h1"));
	        String expectedHeader = "Example";
	        String actualHeader = header.getText();
	        Assert.assertEquals(actualHeader, expectedHeader, "Page header is not as expected");
	    }

	  

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
}
}