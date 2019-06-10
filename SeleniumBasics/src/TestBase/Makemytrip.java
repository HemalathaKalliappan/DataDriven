package TestBase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.Data;

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
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.google.gson.JsonObject;
public class Makemytrip {
static WebDriver d1;
private String departureDate=null;
private String returnDate=null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		d1 = new ChromeDriver(capabilities);
		d1.get("https://www.makemytrip.com/");
		d1.manage().window().maximize();
		d1.manage().deleteAllCookies();
		d1.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d1.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-21/05/2019_BLR-DEL-23/05/2019&tripType=R&paxType=A-1_C-0_I-0&intl=false&=&cabinClass=E");
		/*
		WebElement li3 =d1.findElement(By.xpath("//ul//li[@id='react-autowhatever-1-section-0-item-0']"));
		li3.click();
		Thread.sleep(2000);
		//fromandtocity.sendKeys(Keys.TAB,"Bangalore");
		
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
		}*/
		Thread.sleep(2000);
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
		/*
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		d1 = new ChromeDriver(capabilities);
		d1.get("https://www.makemytrip.com/");
		d1.manage().window().maximize();
		d1.manage().deleteAllCookies();
		d1.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);*/
		/*d1.findElement(By.xpath("//a[@class='active makeFlex hrtlCenter column']")).click();
		String li ="//li[contains(text(),'%replacable%')]/child::span";
		d1.findElement(get(li,"Round Trip")).click();
	//	li.click();
		d1.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
		Actions a1 = new Actions(d1);
		WebElement fromandtocity= d1.findElement(By.xpath("//input[@placeholder='From']"));
		a1.moveToElement(fromandtocity).sendKeys("Mumbai").build().perform();
		//fromandtocity.sendKeys("Mumbai");
		WebElement autosuggestFirstOption= d1.findElement(By.xpath("//li[@class='react-autosuggest__suggestion react-autosuggest__suggestion--first']"));
		toBeclickable(autosuggestFirstOption);
		autosuggestFirstOption.click();
		WebElement tocity=d1.findElement(By.xpath("//input[@placeholder='To']"));
		tocity.sendKeys("Bangalore",Keys.);
		Makemytrip date = new Makemytrip();
		Date date1 =  new Date();
		System.out.println(date1);
		Calendar cal = Calendar.getInstance();
		String[] rawDate=cal.getTime().toString().split(" ");
		System.out.println(rawDate);
		date.departureDate=rawDate[0]+" "+rawDate[1]+" "+rawDate[2]+" "+rawDate[5];
		System.out.println(date.departureDate);
		cal.add(Calendar.DATE, Integer.parseInt("7"));
		rawDate=cal.getTime().toString().split(" ");
		date.returnDate=rawDate[0]+" "+rawDate[1]+" "+rawDate[2]+" "+rawDate[5];
		System.out.println(date.returnDate);
		Thread.sleep(2000);*/
		d1.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-17/05/2019_BLR-DEL-18/05/2019&tripType=R&paxType=A-1_C-0_I-0&intl=false&=&cabinClass=E");
		Thread.sleep(2000);
		get(13);

	}
	public static void SendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	
	
	
	public static void toBeclickable2(WebElement element,String data)
	{
		while(!element.getAttribute("innerText").toLowerCase().contains(data.toLowerCase()))
		{
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	public static void toBeclickable(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(d1, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public static By get(String xpath,String data)
	{
		String rawXpath=xpath.replaceAll("%replacable%", data);
		return By.xpath(rawXpath);
	}
	public static void get(int dep)
	{
		List<WebElement> departureFilghts=d1.findElements(By.xpath("//div[@class='splitVw-sctn pull-left']/child::div[2]/child::div"));
		String[] Flightdetails=departureFilghts.get(dep).getAttribute("innerText").split("\\r?\\n");
		System.out.println(Flightdetails[13]);
	}
}
