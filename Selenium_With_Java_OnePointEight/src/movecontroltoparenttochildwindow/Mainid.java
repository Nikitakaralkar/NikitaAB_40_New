package movecontroltoparenttochildwindow;

import org.openqa.selenium.chrome.ChromeDriver;

public class Mainid {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com");
		  String parentid = driver.getWindowHandle();
		  System.out.println(parentid);

	}

}
