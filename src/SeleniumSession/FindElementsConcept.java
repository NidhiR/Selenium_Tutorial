package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		
		// get the total count of links on the page
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		// size of linklist 
		System.out.println(linklist.size());
		// get the text of each link on the text
		for(int i=0;i<linklist.size();i++)
		{
			String buttonname1=linklist.get(i).getText();
			System.out.println(buttonname1);
		}
	//-------------------------------------------------------------------------------------------
		// get the total no of input fields
		List <WebElement> linklist1 = driver.findElements(By.tagName("input"));
		System.out.println(linklist1.size());
		
	//-------------------------------------------------------------------------------------------	
		// get the total no of buttons fields
		List <WebElement> linklist2 = driver.findElements(By.tagName("button"));
		System.out.println(linklist2.size());	
		
		// get the text of each link on the text
		for(int i=0;i<linklist2.size();i++)
		{
			String buttonname=linklist2.get(i).getText();
			System.out.println(buttonname);
		}
	}

}
