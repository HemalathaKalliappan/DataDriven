package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

		
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();

		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(link).perform();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();
		

		}

	}


