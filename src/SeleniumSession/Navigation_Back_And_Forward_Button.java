package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Back_And_Forward_Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//used to launch URL
		driver.get("https://www.google.com/");
		
		//used to move or launch to some external URL
		driver.navigate().to("https://www.amazon.com/");
		
		//back and forward simulation
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		// to refresh the page
		driver.navigate().refresh();
	}

}
