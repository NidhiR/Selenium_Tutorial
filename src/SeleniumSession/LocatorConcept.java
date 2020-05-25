package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.linkText("register")).click();
		String title = driver.getTitle();
		driver.findElement(By.name("firstname")).sendKeys("Abc");
		driver.findElement(By.name("lastname")).sendKeys("qrs");
		
		/*
		 * Locators
		
		 1. id
		 driver.findElement(By.id("firstname")).sendKeys("abc");
		
	     2. name
	     driver.findElement(By.name("firstname")).sendKeys("abc");
	     
	     3. xpath
	     driver.findElement(By.xpath("")).sendKeys("abc");
	     
	     4. linkText(a tag)
	     driver.findElement(By.linkText("Sign in")).click();
	     
	     5. partiallinkteaxt
	     driver.findElement(By.partialLinkText("Want to register")).click();
	     
	     6. CSS Selector
	     driver.findElement(By.cssSelector("#id value")).sendKeys("xyz");
	     driver.findElement(By.cssSelector(".class value")).sendKeys("xyz");
	     
	     7. Class
	     driver.findElements(By.className("ancaab")).click();
		*/
	}

}
