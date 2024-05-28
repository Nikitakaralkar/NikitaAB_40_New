package excel_apachePOI_programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream f1= new FileInputStream("D:\\My_Pro\\Selenium_With_Java_OnePointEight\\DataSheet\\nikitaSheet.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("LoginDetails");
		Row r1 = s1.getRow(4);
	    Cell c1 = r1.getCell(1);
	    String companyname = c1.getStringCellValue();
	    System.out.println(companyname);
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement e1  = driver.findElement(By.name("q"));
		e1.sendKeys(companyname);
		e1.sendKeys(Keys.ENTER);
	 
	}

}
