package TestBase;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import junit.framework.Assert;

public class Filedownload {
	public static String downloadpath = "Downloads";
	

	public static void main(String arg[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver d1 = new ChromeDriver();
		Thread.sleep(2000);
		d1.get("https://qa.cricketsocial.net/");
		d1.findElement(By.xpath("/html/body/div[8]/header/div[1]/div/div[3]/nav/div/ul/li[5]/a")).click();
		d1.findElement(By.id("email")).sendKeys("nilakanta@cricketsocial.com");
		d1.findElement(By.id("pwd")).sendKeys("And@1234");
		d1.findElement(By.xpath("//*[@id=\"login_auth\"]/div[3]/div[2]/button")).click();
		d1.get("https://qa.cricketsocial.net/ScheduleUpload/boardId/2301205f-0272-4759-a823-494fb8b3c3aa");
		File filelocation = new File("C:\\Users\\khemalatha\\Downloads");
		File[] listoffiles= filelocation.listFiles();
		d1.findElement(By.cssSelector("a[href*='/images/Format_OF_schedule_Upload.xls']")).click();
		
		for(File file :listoffiles) {
			
			if(file.getName().equals("Format OF schedule Upload.xls")) {
				System.out.println("downloaded");
			}
		}
		
	}
	
	
	}
	 


