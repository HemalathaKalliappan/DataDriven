package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolltotheBotton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
     driver.get("http://demo.guru99.com/test/guru99home/");    
     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}
