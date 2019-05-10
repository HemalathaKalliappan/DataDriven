package AutoIt;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUploadusingAutoIt {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver d1= new ChromeDriver();
    d1.get("http://tinypic.com/");
    d1.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    d1.findElement(By.xpath("//*[@id=\"the_file\"]")).click();
    Runtime.getRuntime().exec("E:\\Fileupload.exe");		
	}
}
