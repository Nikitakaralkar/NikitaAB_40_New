package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchFlipkart_ClickOn_MensTshirt {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);
		WebElement wb= driver.findElement(By.xpath("//span[.='Fashion']"));
		a.moveToElement(wb).perform();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/object/a[2]"));
		//driver.findElement(By.xpath("//a[@href='/mens-tshirts/pr?sid=clo,ash,ank,edy&fm=neo%22Fmerchandising&iid=M_37df94ba-4b84-4e15-8762-31621289b691_1_372UD5BXDFYS_MC.IF56C41VGEYS&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BT-Shirts_IF56C41VGEYS&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&cid=IF56C41VGEYS"));
		
	

		
	}

}
