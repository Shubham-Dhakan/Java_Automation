import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import java.util.*;

public class ChangingWindowBrowser {


	public static void main(String[] args) {
		
		// Environment SEtup
		System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Browser Setup and info 
		driver.get("https://demo.automationtesting.in/Windows.html");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement new_window_button = driver.findElement(By.cssSelector("button.btn.btn-info"));
		System.out.println(new_window_button.isDisplayed());			// Locator has located the element perfectly 
		new_window_button.click();										// Opens new window after clicking button 
		//System.out.println(driver.getTitle());							// Second Web-site title 
		
		Set <String>s =  driver.getWindowHandles();						// Storing Window id's in "Set" data-type	
		
		for (String i:s) {
			String t = driver.switchTo().window(i).getTitle();
			//System.out.println(t);								// It will print the title of both windows 
				
			if(t.equals("Frames & windows"))
			{
			driver.close();	// Once it will detect Frames & Windows it will close that website with this driver.code 
			}
		}
	}

}
