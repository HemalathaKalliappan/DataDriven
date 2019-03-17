package TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlesAndWaits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        driver.get("https://qa.cricketsocial.net/");
        driver.manage().window().maximize();
        //Global Wait
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Pageload Wait
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        //Static Wait
        Thread.sleep(2000);        
        driver.findElement(By.xpath("//a[contains(text(), 'Login')]")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nilakanta@cricketsocial.com");
        
        WebElement password = driver.findElement(By.xpath("//*[@id=\"pwd\"]"));
        SendKeys(driver, password, 10, "And@1234");
        
        WebElement submit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        ClickOn(driver, submit, 10);
        
        driver.get("https://qa.cricketsocial.net/LeaguePoints/ec60e177-e027-42cf-9b0b-a0413b0f0bc3");
        driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'See All')]")).click();
        //Which gets the current window
        String handle = driver.getWindowHandle();
		//Prints the id of the window
        System.out.println(handle);
        //Get the number 
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("test1");
	}
	
	public static void SendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void ClickOn(WebDriver driver, WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}


}
