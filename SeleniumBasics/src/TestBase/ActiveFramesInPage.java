package TestBase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveFramesInPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver d1 = new ChromeDriver(); 
        d1.get("http://demo.guru99.com/test/guru99home/");
        List<WebElement> frames = d1.findElements(By.tagName("iframe"));
        System.out.println(frames.size());
        for(int i=0;i<frames.size();i++) {
        System.out.println(frames.get(i).getAttribute("name"));
        	}
        }

	}


