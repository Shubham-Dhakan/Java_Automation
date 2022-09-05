import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Headless Setup 
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		// Environment Setup
		System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Browser Setup and Info
		driver.get("https://ebay.ca");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// Locating WebElement
		WebElement fashion = driver.findElement(By.linkText("Fashion"));
		System.out.println(fashion.isDisplayed()+": fashion is displayed");
		
		// Actions Class
		Actions action = new Actions(driver);
		action.moveToElement(fashion).build().perform();
		
		System.out.println("Program is over");
		driver.close();  
	}

}
