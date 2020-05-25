package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/input-type-file/");
		Thread.sleep(5000); 
		// in sendkey give file path ,dont click on browser
		driver.findElement(By.id("fileupload")).sendKeys("/home/mayank/Desktop/pom.xml");
		
		// for frames:-
		//driver.switchTo().frame("mainpanel"); ----- can accept string
		//driver.switchTo().frame(0); -------can accept integer also
		
		}

}
