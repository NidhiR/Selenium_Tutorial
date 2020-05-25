package SeleniumSession;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 Different types of Pop Up:-
			1. alerts :-JavaScript Pop Up ---Alert API(accept,dismiss)
			2. file upload :-Browse button---(type=file,sendkeys(give path))
			3. browse window pop up :- Advertisement Pop Up ----WindowHandler API(getwindowhandles())
		*/
		
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://popuptest.com/popuptest4.html");
		driver.findElement(By.linkText("Mouseover PopUp")).click();
		Thread.sleep(2000);
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWindowid = it.next();
		System.out.println("Parent Window Id :"+ parentWindowid);// it will give first value
		
		String childWindowid = it.next();
		System.out.println("Child Window Id :"+ childWindowid);
		
		driver.switchTo().window(childWindowid);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println("Child Window Pop up Title:- " + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowid);
		Thread.sleep(2000);
		System.out.println("Parent Window Pop up Title:- " + driver.getTitle());
		driver.close();// used to close specific window(specific browser will be closed)
		//driver.quit(); // used to close both window(all the browser is closed)
	}

}
