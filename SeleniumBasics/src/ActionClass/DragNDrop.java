package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	 driver.get("https://jqueryui.com/droppable/");
	 driver.switchTo().frame(0);
	 WebElement source= driver.findElement(By.id("draggable"));
	 WebElement target= driver.findElement(By.id("droppable"));
	 
	Actions d1 =new Actions(driver);
	d1.clickAndHold(source).moveToElement(target).release().build().perform();
}
}
