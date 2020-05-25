package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		driver.findElement(By.name("first_name")).sendKeys("Ram");
		driver.findElement(By.name("last_name")).sendKeys("Mehta");
		driver.findElement(By.name("email")).sendKeys("ram@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("8991237861");
		driver.findElement(By.name("address")).sendKeys("123 krishna nagar");
		driver.findElement(By.name("city")).sendKeys("atlanta");
		//handle drop down
		Select select = new Select(driver.findElement(By.name("state")));
		select.selectByVisibleText("Georgia");
		
		driver.findElement(By.name("zip")).sendKeys("532004");
		driver.findElement(By.name("website")).sendKeys("www.google.com");
		driver.findElement(By.xpath("//input[@value='no']")).click();
		driver.findElement(By.name("comment")).sendKeys("Testing website");
		driver.findElement(By.className("btn btn-default")).click();
	}

}
