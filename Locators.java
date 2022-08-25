/* Locators: 
 1) id
 2) name 
 3) class
 4) CSS Selector - tag & id | tag & class | tag & attribute | tag with class & attribute
 5) XPATH: - Absolute/Relative
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws InterruptedException  {
	
		System.setProperty("webdriver.chrom.driver","C:\\Web Drivers\\chromedriver.exe");
		
		// Setting Headless Setup
		//ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver();
		
		// Opening browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();			// Maximize window
		
		
		
		// Get commands
		System.out.println(driver.getTitle());			// get & print title
		System.out.println(driver.getCurrentUrl());		// get & print url 
		
		Thread.sleep(3000);
		
		// Locators Stratergies:
		WebElement email = driver.findElement(By.name("username"));		// name --> Locator
		email.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));	// name - locator
		password.sendKeys("admin123");
		
		// RELAVTICE XPATH Method
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		
		
	}

}
