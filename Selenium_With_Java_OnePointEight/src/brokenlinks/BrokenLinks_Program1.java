package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_Program1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.google.co.in");
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(int i=0;i<alllinks.size();i++)
		{
			WebElement a1 = alllinks.get(i);
			
			String url= a1.getAttribute("href");
			
			//String url = a1.getText();
			//System.out.println(url);
			//System.out.println(url);
			verify_each_link(url);
		}
                
	}
	
	 static void verify_each_link(String url) throws IOException
     {
		try
		{ 
    	URL url1= new URL(url);
    	HttpURLConnection url2 =(HttpURLConnection) url1.openConnection();
    	url2.connect();
    	
    	if(url2.getResponseCode()==200)
    	{
    		System.out.println("Link is Valid " +url2.getResponseCode() +" " +url2.getResponseMessage() +" " +url);
    		
    	}
    	
    	else
    	{
    		System.out.println("Link is Not Valid " +url2.getResponseCode() +" "  +url2.getResponseMessage() + " "  +url);
    		
    	}
		}
		catch(NullPointerException a1)
		{
			System.out.println("Sonce url was null it was handled");
		}
		
		catch(MalformedURLException a2)
		{
			System.out.println("Sonce url was null it was handled");
		}
		
     }

}
