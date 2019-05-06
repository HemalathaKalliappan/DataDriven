package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	
        driver.get("http://demo.guru99.com/test/guru99home/");	
        driver.manage().window().maximize();

        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,300)");
	}
}
