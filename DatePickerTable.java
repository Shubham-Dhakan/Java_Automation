/*
 
 1) Open Web-site
 2) GET title
 3) GET URL 
 4) Identify date picker Element
 5) Identify Next button
 6) Get text of all the months in variable 
 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerTable {

	public static void main(String[] args) throws InterruptedException {
	
			// Environment Setup
			System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			// Browser Setup and info 
			driver.get("https://testautomationpractice.blogspot.com/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.manage().window().maximize();
			
			// *****************************Handling Date Picker Web-Table***************************************
			
			// Step 1 - Identify date picker element
			WebElement date = driver.findElement(By.cssSelector("input#datepicker"));		// CSS Selector --> Locator
			System.out.println(date.isDisplayed());						// To cross-check that locator has located web element
			date.click();
			
		
			
		 
	/* for (int i=8;i<=13;i++)				// For Future Months 
		
		{
			Thread.sleep(1000);					// Wait
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				if(month.equals("December")) 
				{
					driver.findElement(By.linkText("27")).click();
					break;
				}
		}
	*/
			for (int i=8;i>=1;i--) {		// For Past Months 
				Thread.sleep(1000);
				WebElement previous_button = driver.findElement(By.xpath("//span[contains(text(),'Prev')]"));
				previous_button.click();
				String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				
				if(month.equals("January"))
				{
				driver.findElement(By.linkText("24")).click();
				break;
			}
				
		}
		
		System.out.println("program is over");	
		// driver.close();
	
	}

}

