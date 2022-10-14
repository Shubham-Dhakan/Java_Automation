import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SortingWebtableUsingStreams {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Environment Setup
		System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Browser Setup & Info 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement header = driver.findElement(By.xpath("//table[@class='table table-bordered']/thead/tr/th[1]"));
		header.click();
		
		List <WebElement> list = driver.findElements(By.xpath("//table[@class='table table-bordered']//tbody/tr/td[1]"));
		
		/* Streams Concept from here --> 
		 * Storing text in "" original list "" variable from List "" WebElemet "" -- Using Streams Concept 
		 * Now storing list in new list (sorted order) using Stream feature 
		 * Implementing TESTNG Assertions 
		 */
		List <String> originalList = list.stream().map(s->s.getText()).collect(Collectors.toList());
		List <String> sortedOriginalList = originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertFalse(originalList.equals(sortedOriginalList));					// TestNg Concept 
		
	
	}

}
