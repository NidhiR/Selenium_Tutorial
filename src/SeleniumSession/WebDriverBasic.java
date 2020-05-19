package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. FF Browser
		
		/*System.setProperty("webdriver.gecko.driver", "/home/mayank/Desktop/Selenium Material/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		*/
		
		
		//2. Chrome Driver 
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		//validate url
		if(title.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more\n" + 
				""))
			System.out.println("corrrect title");
		else
			System.out.println("incorrect title");
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.close();
		driver.quit(); // quit the browser
	}
	
	

}
