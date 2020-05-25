package SeleniumSession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertyFile {
	
		static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Properties prop =new Properties();
		FileInputStream ip = new FileInputStream("/home/mayank/eclipse-workspace/Full_Selenium_Tutorial/src/SeleniumSession/config.properties");
		prop.load(ip);
		//System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String urlname=prop.getProperty("URL");
		System.out.println(urlname);
		
		
		String browsername = prop.getProperty("Browser");
		System.out.println(browsername);
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
		}	
		else
		{
			System.out.println("Wrong Browser");
		}	
		
		Thread.sleep(3000);
		driver.close();
		//driver.get(urlname);	
		
	}
	

}
