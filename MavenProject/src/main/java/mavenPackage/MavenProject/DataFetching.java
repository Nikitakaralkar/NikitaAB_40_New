package mavenPackage.MavenProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DataFetching {
    
	static String username;
	static String password;
	
	static public void testdata() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("D:\\My_Pro\\Selenium_With_Java_OnePointEight\\DataSheet\\nikitaSheet.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
	    
	     username = NumberToTextConverter.toText((w1.getSheet("Amazon_cred").getRow(2).getCell(0).getNumericCellValue()));
	     password = w1.getSheet("Amazon_cred").getRow(2).getCell(1).getStringCellValue();
	    		
	}
}
