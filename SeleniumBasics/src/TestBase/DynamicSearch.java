package TestBase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSearch {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
		Thread.sleep(2000);
	      List<WebElement> d2 = driver.findElements(By.xpath("//ul//li[@role='presentation']"));
	      System.out.println("total number" + d2.size());
	      for(int i=0;i<d2.size();i++) {
	    	  System.out.println(d2.get(i).getText());
	    	  if(d2.get(i).getText().contains("testing interview")) {
	    		  Thread.sleep(2000);
	    		  d2.get(i).click();
	    		  break;
	    	  }
	      
	      
	      }
	
}
}
