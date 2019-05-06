package TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicCalender {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d1= new ChromeDriver();
	    d1.get("https://dev.cricketsocial.net/");
	    d1.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d1.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		d1.findElement(By.id("email")).sendKeys("csv@cricketsocial.com");
		d1.findElement(By.id("pwd")).sendKeys("abcdefmj");
		Thread.sleep(2000);
		d1.findElement(By.xpath("//*[@id=\"login_auth\"]/div[3]/div[2]/button")).click();
		d1.get("https://dev.cricketsocial.net/CreateSchedule/boardId/10f751e1-4d15-43d6-a6bc-3f471edce9d3");
		d1.findElement(By.xpath("//*[@id=\"date\"]")).click();
		WebElement e1 =d1.findElement(By.xpath("/html/body/div[13]/div[1]/table/thead/tr[1]/th[2]"));
		e1.click();
		d1.findElement(By.xpath("/html/body/div[13]/div[2]/table/thead/tr/th[2]")).click();
		String year= "2020";
		String month= "Dec";
		String date = "17";
		String yearbeforexpath = "/html/body/div[13]/div[3]/table/tbody/tr/td/span[";
		String monthbeforxpath = "/html/body/div[13]/div[2]/table/tbody/tr/td/span[";
		String datebeforexpath = "/html/body/div[13]/div[1]/table/tbody/tr[";
		String dateAfterxpath = "]/td[";
		for(int i=1;i<=12;i++) {
			String yearval =d1.findElement(By.xpath(yearbeforexpath+i+"]")).getText();
			if(yearval.equals(year)) {
				d1.findElement(By.xpath(yearbeforexpath+i+"]")).click();
				 break;
			}
		}
		for(int i1=1;i1<=12;i1++) {
			String monthval =d1.findElement(By.xpath(monthbeforxpath+i1+"]")).getText();
			System.out.println(monthval);
			if(monthval.equals(month)) {
				d1.findElement(By.xpath(monthbeforxpath+i1+"]")).click();
				 break;
			}
		}
		for(int rownum=1; rownum<=6; rownum++) {
			for(int colnum=1;colnum<=7;colnum++) {
			String dayval = d1.findElement(By.xpath(datebeforexpath+rownum+dateAfterxpath+colnum+"]")).getText();
			System.out.println(dayval);
			if(dayval.equals("17")) {
				 d1.findElement(By.xpath(datebeforexpath+rownum+dateAfterxpath+colnum+"]")).click();
				 break;
			}
			}
		}
	}
}



