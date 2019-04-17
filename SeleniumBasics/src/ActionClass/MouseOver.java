package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	 driver.get("http://mrbool.com/");
	Actions d1 =new Actions(driver);
	d1.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ul[@class='submenu']//li//a[contains(text(),'Articles')]")).click();
	System.out.println("Clicked");
		
		
		
	}
	
}
