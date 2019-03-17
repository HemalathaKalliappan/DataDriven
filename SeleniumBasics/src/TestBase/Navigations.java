package TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigations {
	public static void main(String[] args) {
		 // Create a new instance of the FireFox driver
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		 
		 // Open ToolsQA web site
		 String Url = "https://www.google.com/";
		 driver.get(Url);
		 
		 // Click on gmail link
		 driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		 
		 // Go back to google Page
		 driver.navigate().back();
		 
		 // Go forward to gmail page
		 driver.navigate().forward();
		 
		 // Go back to google page
		 driver.navigate().to(Url);
		 
		 // Refresh browser
		 driver.navigate().refresh();
		 
		 // Close browser
		 driver.close();
		 }

}
