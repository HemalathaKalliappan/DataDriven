package TestBase;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Locator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        //driver.findElement(By.id(""));
        driver.manage().window().maximize();
		
		driver.get("https://symbizsolutions.com/sugar/index.php?action=Login&module=Users");
		
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("pass");
		driver.findElement(By.xpath("//input[@title='Log In']")).click();
		Actions a=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//a[@id='grouptab_2']"));
		a.moveToElement(e).perform();
		driver.findElement(By.xpath("//a[@id='moduleTab_2_Accounts']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Trent Ltd");
		driver.findElement(By.xpath("//input[@id='phone_office']")).sendKeys("04425977070");
		driver.findElement(By.xpath("//input[@id='website']")).sendKeys("www.trent.com");
		driver.findElement(By.xpath("//input[@id='phone_fax']")).sendKeys("+1 044 259874545");
		
		driver.findElement(By.xpath("//textarea[@id='billing_address_street']")).sendKeys("51, Basuvayan Street, Old Washermenpet");
		driver.findElement(By.xpath("//input[@id='billing_address_city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='billing_address_state']")).sendKeys("Tamilnadu");
		driver.findElement(By.xpath("//input[@id='billing_address_postalcode']")).sendKeys("600 021");
		driver.findElement(By.xpath("//input[@id='billing_address_country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='shipping_checkbox']")).click();
		
		driver.findElement(By.xpath("//input[@id='Accounts0emailAddress0']")).sendKeys("trent@gmail.com");
		driver.findElement(By.xpath("//input[@id='Accounts0emailAddressOptOutFlag0']")).click();
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("This is a good company");
		
		Select drpType=new Select(driver.findElement(By.name("account_type")));
		drpType.selectByVisibleText("Analyst");
		
		Select drpType1=new Select(driver.findElement(By.name("industry")));
		drpType1.selectByVisibleText("Chemicals");
	
		driver.findElement(By.xpath("//input[@id='annual_revenue']")).sendKeys("500 crores");
		driver.findElement(By.xpath("//input[@id='employees']")).sendKeys("1600");
		driver.findElement(By.xpath("//input[@id='sic_code']")).sendKeys("HLS007");
		driver.findElement(By.xpath("//input[@id='ticker_symbol']")).sendKeys("HVLS");
		driver.findElement(By.xpath("//button[@id='btn_parent_name']")).click();
		
		//driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Havells")).click();
		//driver.findElement(By.xpath("//a[@online='send_back('Accounts','66b79390-5c5e-fb8f-4ad0-5bb31198c8e9');']")).click();
		//driver.findElement(By.xpath("//input[@id='parent_name']")).sendKeys("Havells");
		driver.findElement(By.xpath("//input[@id='ownership']")).sendKeys("100%");
		driver.findElement(By.xpath("//input[@id='campaign_name']")).sendKeys("Social Responsibility");
		driver.findElement(By.xpath("//input[@id='rating']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@id='SAVE_FOOTER']")).click();
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		driver.findElement(By.xpath("//*[@id=\"name_advanced\"]")).sendKeys("hema");
		
        
	}

}
