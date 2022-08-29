import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {

	public static void main(String[] args) throws InterruptedException {
		
		//Environment Setup
		System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Browser setup and info
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	
		/*	
	 	WebElement button = driver.findElement(By.id("alertexamples"));
		button.click();
	
		//Method 1: Normal Alert
		String alert_text = driver.switchTo().alert().getText();	// it will store alert text in variable	
		System.out.println(alert_text);						
		driver.switchTo().alert().accept();						// It will select accept option
		driver.switchTo().alert().dismiss();					// It will select Cancel option 
		*/
	
		/*
		// Method 2: Prompt Alert
		WebElement prompt_alert = driver.findElement(By.id("promptexample"));
		System.out.println(prompt_alert.isDisplayed());
		prompt_alert.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(1000);
		alert.sendKeys("shubham");
		alert.accept();
		//driver.close();
		*/
		
		//Method 3: Confirm Alert 
		WebElement confirm_alert = driver.findElement(By.id("confirmexample"));
		System.out.println(confirm_alert.isDisplayed());
		confirm_alert.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		//alert.accept();
		alert.dismiss();
		//driver.close();
	}

}
