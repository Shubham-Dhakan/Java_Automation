import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Headless Setup
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		// Environment Setup
		System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Browser Setup and info
		driver.navigate().to("https://testautomationpractice.blogspot.com/");			// Using this website for doubleclick()
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		// Double Click
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		System.out.println("button is displayed: "+button.isDisplayed());
		Actions action = new Actions(driver);
		action.doubleClick(button).build().perform();
		
	}

}
