import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Headless Setup 
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		// Environment Setup
		System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Browser Setup and Info
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// Login Setup 
		WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
		email.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		
		WebElement admin = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
		System.out.println(admin.isDisplayed()+": admin is displayed");			// Using isDisplyad() to double check weather locator has located right element
	
		
		
		// Actions Class
		WebElement Usr_mg = driver.findElement(By.cssSelector("span.oxd-topbar-body-nav-tab-item"));
		System.out.println(Usr_mg.isDisplayed()+": Usr_mg is Dislpayed");
		WebElement Users = driver.findElement(By.linkText("Users"));	
	
		Actions action = new Actions(driver);		// We have to use Chrome-driver class instance in "argument"
		// Mouse hover Code 
		action.moveToElement(admin).click().moveToElement(Usr_mg).moveToElement(Users).click().build().perform();		// We have to use build().perform()
																												// Pre-requisite steps 
		
			}

}
