import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class InvokingNewWindowTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Environment Setup 
		System.setProperty("webdriver.chrome.driver", "C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Browser Setup and Info 
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		System.out.println("First WebSite URL: "+driver.getCurrentUrl());
		System.out.println("First WebSite Title: "+driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);							// Driver Focus remains on the first TAB still 
		
		Set <String> windows = driver.getWindowHandles();
		Iterator <String> it = windows.iterator();		// Iterator Instance has two windowHandles and Selected None 
		String parentId = it.next();
		String childId = it.next();
		
		driver.get("https://courses.rahulshettyacademy.com/courses");
		
		// Executing Scroll Concept
		WebElement linkText = driver.findElement(By.xpath("//div[@title='All-Access Membership']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",linkText);
		
		String linkText1 = driver.findElement(By.xpath("//div[@title='All-Access Membership']")).getText();
		
		driver.switchTo().window(parentId);
		
		// Relavtive Locator Concept for Entering the Value
		WebElement label = driver.findElement(By.xpath("//label[text()='Email']"));
		
		driver.findElement(with(By.tagName("input")).above(label)).sendKeys(linkText1);	
	/*  // Sendkeys is not working in relative Operator when using " Below Relative Operator"
	 * In Below operator it surpasses the desired element we want to locate 
	 */	
		
		//driver.findElement(By.name("name")).sendKeys(linkText1);
		
		
		/*	while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	*/	
		
	
		
		
	}

}
