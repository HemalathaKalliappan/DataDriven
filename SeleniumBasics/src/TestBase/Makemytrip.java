package TestBase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.IFGT;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.gson.JsonObject;

public class Makemytrip {
static WebDriver d1;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		
	ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		d1 = new ChromeDriver(capabilities);
	//	d1 = new ChromeDriver();
		d1.get("https://www.makemytrip.com/");
		d1.manage().window().maximize();
		d1.manage().deleteAllCookies();
		d1.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d1.findElement(By.xpath("//a[@class='active makeFlex hrtlCenter column']")).click();
		List<WebElement> li = d1.findElements(By.xpath("//ul//li//span[@class='tabsCircle appendRight5']"));
		li.get(1).click();
		
		d1.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
		WebElement fromandtocity= d1.findElement(By.xpath("//input[@type='text' and @aria-controls='react-autowhatever-1']"));
		fromandtocity.sendKeys("Mumbai");
	/*	WebElement li3 =d1.findElement(By.xpath("//ul//li[@id='react-autowhatever-1-section-0-item-0']"));
		li3.click();*/
		Thread.sleep(2000);
		fromandtocity.sendKeys(Keys.TAB,"Bangalore");
		
		List<WebElement> li2 = d1.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li"));
		System.out.println(li2.size());
		Actions a1 = new Actions(d1);
		WebElement a2 = d1.findElement(By.xpath("//*[@id=\"departure\"]"));
		a1.moveToElement(a2).click().build().perform();
		String dt = "//div[@aria-label='";
		DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy");
		Date date =  new Date();
		String todate = dateFormat.format(date);
		System.out.println(todate);
		d1.findElement(By.xpath(dt+todate+"']")).click();
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, +7);
		String todate1 = dateFormat.format(cal.getTime());
		d1.findElement(By.xpath(dt+todate1.trim()+"']")).click();
		
		d1.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/p/a")).click();
		d1.manage().deleteAllCookies();
		Thread.sleep(5000);
		List<WebElement> l1 = d1.findElements(By.xpath("//div[@id='rt-domrt-jrny']//following::div[@class='fli-list splitVw-listing']"));
		System.out.println("List--------------->"+l1.size());
		
		Thread.sleep(2000);
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
			if(l1.get(i).equals(l1.get(1))) {
				Thread.sleep(2000);
		l1.get(i).click();
		break;
		}
		}
		
		WebElement e1 = d1.findElement(By.xpath("//div[@class='splitVw-footer-left ']//following::div[@class='pull-right marL5 text-right']//span[1]"));
		String s1 = e1.getText();
		s1 = s1.replaceAll(",", "");
		s1= s1.split(" ")[1];
		int result = Integer.parseInt(s1);
	//	System.out.println(result);
		
		WebElement e2 = d1.findElement(By.xpath("//div[@class='splitVw-footer-right ']//following::div[@class='pull-right marL5 text-right']//span[1]"));
		String s2 = e2.getText();
		s2 = s2.replaceAll(",", "");
		s2= s2.split(" ")[1];
		int result1 = Integer.parseInt(s2);
		
		WebElement total = d1.findElement(By.xpath("//div[@class='splitVw-footer-total make_relative make_flex alC']//span[1]"));
	String tot =total.getText();;
	tot = tot.replaceAll(",", "");
	tot= tot.split(" ")[1];
	int finalresult = Integer.parseInt(tot);
		
		int totalvalue = result+result1;
		Assert.assertEquals(totalvalue, finalresult, "Value is Mismatched");
		
		
		
		
		//d1.findElement(By.xpath("//*[@id=\"rt-domrt-jrny\"]/div[2]/div[2]/label/div[1]/span[1]")).click();
		
		
		
		//System.out.println("Date = "+cal.getTime());
		
	//	d1.findElement(By.xpath(dt+cal+"']")).click();
		//System.out.println("Date = "+cal.getTime());
		
		/*Thread.sleep(5000);
		d1.switchTo().frame("notification-frame-~10cb566a7");
		d1.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]")).click();
		//d1.findElement(By.xpath("//div[@aria-label='Wed May 08 2019']")).click();
*/		
		//li3.sendKeys(Keys.TAB);
		
		/*WebElement tocity =d1.findElement(By.xpath("//*[@id=\"toCity\"]"));
		tocity.click();*/
	
		
		/*WebElement d5 = d1.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		d5.sendKeys("Bangalore");
		Thread.sleep(2000);*/
		//d1.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("Bangalore");;
		

		
		
	/*	for(int i=0;i<li2.size();i++) {	
			Thread.sleep(2000);
			WebElement d3 = d1.findElement(By.xpath("//ul//li[@id='react-autowhatever-1-section-1-item-"+i+"']"));
			Thread.sleep(2000);
			System.out.println(d3.getText());
			if(li2.equals("Pune, India Pune Airport PNQ")) {
				Thread.sleep(2000);
				Actions a1 = new Actions(d1);
				a1.moveToElement(d3).click().build().perform();
				
				break;
			}
			else {
				li3.click();
			}

		}
		*/
	
	}
	public static void SendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
}
