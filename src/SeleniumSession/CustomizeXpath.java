package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Advantages of customize xpath:-
		 * 1. Performance is very fast
		 * 2. its unique,generic
		 * 3. syntax is simple
			*/
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("abcd");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		
		driver.findElement(By.xpath("//input[contains(@class,'LM6RPg')]")).sendKeys("abcd");

		/*
		To Handle Dynamic id:-
						 1) Contains
						 2) starts-with
						 3) ends-with
		using contains function:- it is used when value is not constant
									its change everytime when u refresh the page.
							
				id=test_123
				id=test_1234
				id=test_12345
				id=test_123456
		driver.findElement(By.xpath("//input[contains(@id,'test_'	)]")).sendKeys("abcd");
		//--------------------------------------------------------------------------------
		
				 id=test_123
				 id=test_1234
				 id=test_12345
				 id=test_test_123456
		
		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("xyz");
		
		//------------------------------------------------------------------------------
		
				 id=123_test
				 id=1234_test
				 id=12345_test
		driver.findElement(By.xpath("//input[ends-with(@id,'_test')]")).sendKeys("xyz");
		
	//---------------------------------------------------------------------------------------
	
		*/
		//xpath specially for link:- represented by <a> html tag
		driver.findElement(By.xpath("a[contains(text(),'Login')]")).click();
	
	}

}
