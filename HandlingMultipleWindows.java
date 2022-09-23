import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Environment setup
		System.setProperty("webdriver.chrome.driver", "C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Browser Setup and Info
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));			// implicit wait global
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Selenium")));
		
		List <WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		System.out.println(links.size());
		//Thread.sleep(5000);
		for (int i=0;i<links.size();i++) {
			
			links.get(i).click();
			}
	
		Set<String> handles = driver.getWindowHandles();
		Iterator <String> it = handles.iterator();
		String web1 = it.next();
		String web2 = it.next();
		String web3 = it.next();
		String web4 = it.next();
		String web5 = it.next();
		System.out.println(driver.switchTo().window(web5).getTitle());
		
	
	/*	for (WebElement l:links) {							// Alternate Method to open 5 websites  
			l.click();
	*/	
		}
	
	}


