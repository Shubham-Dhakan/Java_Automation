/*
  
 1) Setup Headless Configurations 
 2) Open browser
 3) Open URL		
 4) Get title
 5) Get url
 6) Enter User Name
 7) Click on OK
 8) Check the Page title
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessLoginTestCase {

	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
		
		// Headless Test Setup
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(options);	// This will open the chrome browser in headless 
														// Through this method we can open any browser
		
		//ChromeDriver driver = new ChromeDriver();  Over here we are hardcoding it for chrome browser only.
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();		// It will maximize the window
		System.out.println("Website title:"+driver.getTitle());		// It will print&get website title
		System.out.println("Website URL:"+driver.getCurrentUrl());	// It will print&get url
		
		WebElement Username = driver.findElement(By.name("user-name"));	// Using By	Locator
		Username.sendKeys("standard_user");								// Using sendkeys to send value
		
		WebElement Password = driver.findElement(By.name("password"));	// Using By Locator 
		Password.sendKeys("secret_sauce");								// Using sendkeys to send value
		
		WebElement LoginButton = driver.findElement(By.name("login-button"));
		LoginButton.click();											// Using click() function to press login button
		
		String exp_webtitle = "Swag Labs";
		String act_webtitle = driver.getTitle();
		System.out.println(act_webtitle);
		
		//if (exp_webtitle.equals(act_webtitle)) 
			if (exp_webtitle.equals(act_webtitle)) 
		{
			System.out.println("Login test case is passed");
		}
		else
		{
			System.out.println("Login test case is failed");
		}
		driver.close();
		
	}

}
