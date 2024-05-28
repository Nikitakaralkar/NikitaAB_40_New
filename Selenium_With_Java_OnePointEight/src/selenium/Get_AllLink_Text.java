package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_AllLink_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			List<WebElement> alllinks = driver.findElements(By.tagName("a"));
			System.out.println(alllinks.size());
			for(int i=0;i<alllinks.size();i++)
			{
				WebElement a1 = alllinks.get(i);
				
				String url = a1.getText();
				System.out.println(url);
			}
			

	}

}
