package TestBase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUpload {
	
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver d1= new ChromeDriver();
    d1.get("https://dev.cricketsocial.net/");
    d1.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	d1.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	d1.findElement(By.id("email")).sendKeys("csv@cricketsocial.com");
	d1.findElement(By.id("pwd")).sendKeys("abcdefmj");
	Thread.sleep(2000);
	d1.findElement(By.xpath("//*[@id=\"login_auth\"]/div[3]/div[2]/button")).click();
	d1.navigate().to("https://dev.cricketsocial.net/ScheduleUpload/boardId/10f751e1-4d15-43d6-a6bc-3f471edce9d3");
	Select d3 = new Select(d1.findElement(By.xpath("//select[@id='tournamentSelectBoxDIv']")));
	d3.selectByValue("437b83f0-5e6a-48f4-9aeb-2814a364383d");
	Thread.sleep(2000);;
	d1.findElement(By.xpath("//*[@id=\"excel\"]")).click();
	
	String syspath = "Downloads\\Format OF schedule Upload (1).xls";
	ClipboardOwner owner = null;
	Robot r1 = new Robot();
	r1.setAutoDelay(2000);
	StringSelection s1 = new StringSelection(syspath);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, owner);
	r1.setAutoDelay(1000);
	r1.keyPress(KeyEvent.VK_CONTROL);
	r1.keyPress(KeyEvent.VK_V);
	r1.keyRelease(KeyEvent.VK_CONTROL);
	r1.keyRelease(KeyEvent.VK_V);
	r1.setAutoDelay(2000);
	r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyPress(KeyEvent.VK_V);
	
	
	
	
}
}
