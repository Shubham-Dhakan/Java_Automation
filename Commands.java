import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Commands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
		
		//Headless Test Setup 
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(options);
		
		// Website 1
		
		driver.get("https://www.amazon.ca/");
		
														// Follwoing are GET commands of Selenium 
		
		System.out.println(driver.getTitle());			// get and print title
		System.out.println(driver.getWindowHandle());	// get and print url 
		System.out.println(driver.getCurrentUrl());		// get and print current url		
		//System.out.println(driver.getPageSource());
		
		//driver.manage().window().maxmize();			// On one window we can maximize for once only
		driver.navigate().refresh();					// navigate command
		
		
		// Website 2
		driver.navigate().to("https://www.honda.ca/");	// navigate command
		
		System.out.println(driver.getTitle());			// get and print title
		System.out.println(driver.getWindowHandle());	// get and print url 
		System.out.println(driver.getCurrentUrl());		// get and print current url		
		
		driver.manage().window().maximize();			
		driver.navigate().back();						// navigate command
		
		
		// we will check weather element is selected
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone 13 pro max");
		
		System.out.println(searchbox.isDisplayed());	// true
		System.out.println(searchbox.isEnabled());		// true
		System.out.println(searchbox.isSelected());		// This is for radio buttons | check Boxes
		
		String exp_title = "Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
		String act_title = driver.getTitle();
		
		if (exp_title.equals(act_title)) {
			System.out.println("program is over");
		}
		
		driver.close();			// Will close current window only
		
		
	}

}
