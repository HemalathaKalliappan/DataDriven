package TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseNumberofWindows {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver d1 = new ChromeDriver();
    d1.get("https://www.guru99.com/sikuli-tutorial.html");
    String d2 = d1.getWindowHandle();
    d1.switchTo().frame("google_ads_iframe_/24132379/guru99.com_300x250_0");
    d1.findElement(By.xpath("//label[@id=\"cbb\"]")).click();
    int size = d1.findElements(By.tagName("iframe")).size();
    System.out.println(size);
    d1.switchTo().defaultContent();
   // d1.switchTo().frame(4);
    d1.findElement(By.xpath("//div[@id=\"cbb\"][2]")).click();
  
    
}
}