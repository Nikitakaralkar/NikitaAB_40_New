package mavenPackage.MavenProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Logout {

	WebDriver driver;
	// Step1
	@FindBy(xpath = "//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']")
	WebElement hoverover_Accounts_Links;

	@FindBy(linkText = "Sign Out")
	WebElement sign_out;

	public void hoverover(WebDriver driver) throws InterruptedException {

		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverover_Accounts_Links).perform();

	}

	@Test(dependsOnMethods = "hoverover")
	public void logout(WebDriver driver) throws InterruptedException {

		Thread.sleep(1000);
		sign_out.click();

	}

	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
