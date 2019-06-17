package TestBase;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksandImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver d1 = new ChromeDriver(); 
        d1.get("https://jqueryui.com/droppable/");
	
		List<WebElement> alllinks = d1.findElements(By.tagName("a"));
		System.out.println(alllinks);
	List<WebElement> li = new ArrayList<WebElement>();
	li.addAll(alllinks);
	System.out.println(li.size());
	
	List<WebElement> activelinks = new ArrayList<WebElement>();
	
	for(int i=0;i<li.size();i++) {
			
	if(li.get(i).getAttribute("href")!=null) {
		activelinks.add(li.get(i));
	}
	}
	System.out.println(activelinks.size());
}
}