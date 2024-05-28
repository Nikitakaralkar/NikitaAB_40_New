package mavenPackage.MavenProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuit {
	
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launch(String nameofbrowser) {
	
	
			if(nameofbrowser.equals("chrome"))
			{
			driver= new ChromeDriver();
			}
		
			
			if(nameofbrowser.equals("edge"))
			{
			driver= new EdgeDriver();
			}
		
		 //driver = new ChromeDriver();
		 //driver = new EdgeDriver();
		//Amazon_Login_Page
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

	@AfterMethod
	public void quit() throws IOException {
		
		 Date currentTime = new Date();
	        long timestamp = currentTime.getTime();

	        // Convert timestamp to human-readable format
	        String formattedTime = new Date(timestamp).toString().replace(":", "-");

		TakesScreenshot	 t1=	(TakesScreenshot) driver;			
		File source=			t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\My_Pro\\MavenProject\\ScreenShots\\"+new LaunchQuit().getClass()   +Math.random()+ formattedTime +".png");
		FileHandler.copy(source, destination);

	}

}
