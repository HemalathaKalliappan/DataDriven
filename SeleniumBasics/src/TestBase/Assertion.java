package TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	SoftAssert softAssert = new SoftAssert();
	//mulitiple instances can be created with in the test cases
	
	@Test
	public void test1() {
		System.out.println("Open browser");
		System.out.println("User name");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String d1 = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).getText();
		System.out.println(d1);
		Assert.assertEquals(d1, "Gmail23", "the value is mismatch");
		System.out.println("Open browser123");
		System.out.println("User name123");
	
	  //span[@class='TQGan']
		//hard assert
		//assert directly from testng
		//case execution will terminated immediately if we use hard assert
		//will use for dependency cases (eg. login validation...)
				
		
		/*System.out.println("Password");
		System.out.println("Navigate to Home page");
		Assert.assertEquals(true,true);
		
		System.out.println("go to company");
		System.out.println("Create a new company");
		softAssert.assertEquals(true, false);// soft assert
		
		//soft assert
		//converting hard assert to soft assert(so creating class object)
		//cases will be skipped.. to mark test case as failed.. Even though test cases fails (cases will be executed)
		
		System.out.println("go to contacts");
		System.out.println("Create a new contacts");
		
		softAssert.assertAll();
		//assert all will verify the soft assert result
	*/
	}
	
	@Test
	public void test2() {
		System.out.println("softassert");
		softAssert.assertEquals(true, false);
		System.out.println("Create a new company");
	//	softAssert.assertAll();
     
	}
	
	

}
