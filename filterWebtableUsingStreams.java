import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filterWebtableUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Environment Setup
		System.setProperty("webdriver.chrome.driver", "C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Browser setup & info 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// Enter desired value in search box
		WebElement inputBox = driver.findElement(By.xpath("//input[@id='search-field']"));
		//inputBox.sendKeys("Rice");
		
		List <WebElement> defaultList = driver.findElements(By.xpath("//table[@class='table table-bordered']//tbody/tr/td[1]"));
		List<WebElement> newList = defaultList.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(newList.size(),defaultList.size());							// TestNg Concept 
		
	}

}
