package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoview {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();

	JavascriptExecutor js = (JavascriptExecutor) driver;
    driver.get("http://demo.guru99.com/test/guru99home/");
    WebElement Element = driver.findElement(By.linkText("Linux"));

    //This will scroll the page till the element is found		
    js.executeScript("arguments[0].scrollIntoView();", Element);
	}
}
