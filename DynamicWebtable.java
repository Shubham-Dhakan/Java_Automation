import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicWebtable {

	public static void main(String[] args) throws InterruptedException {
		
		//Headless Setup
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		// Environment setup
		System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);

		// Browser Setup & info
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());			// print current title
		System.out.println(driver.getCurrentUrl());		// print current url 
		driver.manage().window().maximize();			// maximize window
		Thread.sleep(1000);								// wait command
		
		// Login setup
		WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
		email.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		
		WebElement admin = driver.findElement(By.linkText("Admin"));
		System.out.println(admin.isEnabled());				// Checks locator has located element & // Element is located
		admin.click();										// click() method 
		
		WebElement user_management = driver.findElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']"));
		System.out.println(user_management.isEnabled());	// Checks that locator has located the element properly
		user_management.click();							// Element is located and we can use click() method 
		
		//WebElement users = driver.findElement(By.linkText("Users"));
		WebElement users = driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link']"));
		System.out.println(users.isEnabled());				// Checks that locator has located the element perfectly
		users.click();										// Element is located and we can use click() method	
	
		// Dynamic table 
		//int table = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]")).size();
		int table = driver.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div")).size();
		System.out.println(table);
		
		int statuscount = 0;
		
		for (int i=1;i<=table;i++) {
			String status = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[5]")).getText();
			
			if (status.equals("Enabled")) {
				statuscount = statuscount+1;
			}
			
		}
			System.out.println("no of employees enabled:"+statuscount);
	}
	

}
