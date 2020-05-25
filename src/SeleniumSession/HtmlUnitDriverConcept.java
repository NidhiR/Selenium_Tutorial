package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		
		//WebDriver driver = new ChromeDriver();
		/*
		 * 
		-----------------Without Opening browser it will give the result
		htmlunitdriver:- its not available in selenium 3.x version.
		htmlunitdriver:- to use this concept,we have to download htmlunitdriver JAR file.
		
		Advantages:-
		1 testing happening behind the secene.
		2. execution of test case is very fast.
		3. not suitable for Action class --user actions---movement,doubleclick,drag and drop
		4. Ghost Driver --HeadLess Browser
			HtmlUnit Driver -- Java
			PhantomJS -- Javascript
		
		*/
		
		WebDriver driver = new HtmlUnitDriver();
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		System.out.println("Before clicking login button :-" + driver.getTitle());
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Thread.sleep(3000);
		System.out.println("After clicking login button :-" + driver.getTitle());
		
		//driver.findElement(By.name("firstname")).sendKeys("Abc");
		//driver.findElement(By.name("lastname")).sendKeys("qrs");
	}

}
