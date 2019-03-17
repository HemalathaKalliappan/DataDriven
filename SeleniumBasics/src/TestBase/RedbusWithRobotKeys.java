package TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class RedbusWithRobotKeys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
       driver.get("https://www.redbus.in/");
	WebElement ele = driver.findElement(By.xpath("//input[@id='src']"));
	ele.sendKeys("Chennai");
	Thread.sleep(2000);
	ele.sendKeys(Keys.ARROW_DOWN);
	ele.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	WebElement ele1 = driver.findElement(By.xpath("//input[@id='dest']"));
	ele1.sendKeys("Bangalore");
	Thread.sleep(2000);
	ele1.sendKeys(Keys.ARROW_DOWN);
	ele1.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	WebDriverWait wait2 = new WebDriverWait(driver, 10);
	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"onward_cal\"]")));
	driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[2]")).click();
	driver.findElement(By.className("current day")).click();
	driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
	
	}
}
