package TestBase;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Workshop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        driver.get("http://demo.borland.com/gmopost/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.name("bSubmit")).click();
        WebElement d1 = driver.findElement(By.xpath("//input[@name='QTY_TENTS']"));
        d1.clear();
        d1.sendKeys("10");
        driver.findElement(By.name("bSubmit")).click();
        driver.findElement(By.xpath("//input[@value='Proceed With Order']")).click();
        driver.findElement(By.xpath("//input[@name='billName']")).sendKeys("Hema");
        driver.findElement(By.name("billAddress")).sendKeys("Nesapakkam");
        driver.findElement(By.name("billCity")).sendKeys("Chennai");
        driver.findElement(By.name("billState")).sendKeys("Tamilnadu");
        driver.findElement(By.name("billZipCode")).sendKeys("1245677");
        driver.findElement(By.name("billPhone")).sendKeys("123456");
        driver.findElement(By.name("billEmail")).sendKeys("hema@gmail.com");
        WebElement select = driver.findElement(By.name("CardType"));
        Select card = new Select(select);
        card.selectByVisibleText(" Visa ");
        
        driver.findElement(By.name("CardNumber")).sendKeys("1234567");
        driver.findElement(By.name("CardDate")).sendKeys("12/6/2016");
       // driver.findElement(By.name("shipSameAsBill")).click();
        driver.findElement(By.name("shipName")).sendKeys("Raju");
        driver.findElement(By.name("shipAddress")).sendKeys("kknagar");
        driver.findElement(By.name("shipCity")).sendKeys("chennai");
        driver.findElement(By.name("shipState")).sendKeys("Tamilnade");
        driver.findElement(By.name("shipZipCode")).sendKeys("345");
        driver.findElement(By.name("shipPhone")).sendKeys("9176656324");
        
        
        
        
        
	}

}
