package TestBase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownSortingVerification {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d1= new ChromeDriver();
		d1.get("https://classic.crmpro.com/index.html");
		d1.findElement(By.name("username")).sendKeys("naveenautomation");
		   d1.findElement(By.name("password")).sendKeys("test@123");
		   Thread.sleep(2000);
		   d1.findElement(By.xpath("//input[@type='submit']")).click();
			d1.switchTo().frame("mainpanel");
			Actions action = new Actions(d1);
			WebElement n1 = d1.findElement(By.xpath("//a[contains(text(),'Companies')]"));
			action.moveToElement(n1).build().perform();
			 d1.findElement(By.xpath("//a[contains(text(),'New Company')]")).click();
			 Select s1 = new Select(d1.findElement(By.xpath("//select[@name='status']")));
			 List alloptions = new ArrayList();
			 for(WebElement options: s1.getOptions()) {
				 alloptions.add(options.getText());
			 }
			 List<String> templist = alloptions;
			 Collections.sort(templist);
			 System.out.println(templist);
			 System.out.println(alloptions);
			 if(alloptions.equals(templist)) {
					System.out.println("List is ordered");
				}
				else {
					System.out.println("List is Unordered");
				}
	
	}
	
}
