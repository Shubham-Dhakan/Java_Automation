import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		// Headless Environment Setup
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		// Driver Setup
		System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		// Browser Setup and Info
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		// Handling WebTable
		int table_row = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();			
		int table_column = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th")).size();
		
		System.out.println(table_row);		// 7 rows 
		System.out.println(table_column);	// 4 column
		
		for (int i=2;i<=table_row;i++) 
		{
			for (int j=1;j<=table_column;j++) 
				{
				
				String rc_data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]")).getText();
				System.out.println(rc_data+"		");				
				}
			System.out.println();
		}
		
		driver.close();
	}

}
