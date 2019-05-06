package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();


	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();


	Actions action = new Actions(driver);
	WebElement link = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	action.contextClick(link).perform();


	WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-delete"));
	element.click();
	Alert a1 = driver.switchTo().alert();
	String d1 = a1.getText();
	System.out.println(d1);
	a1.accept();
	
	
}
}
