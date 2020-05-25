package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit wait is dynamic wait
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		
		// Dynamic Wait :- PageLoadTimeout and ImplicitlyWait
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		// applicable for all the elements
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
