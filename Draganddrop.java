import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Headless Setup
				ChromeOptions options = new ChromeOptions();
				options.setHeadless(true);
				
				// Environment Setup
				System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				// Browser Setup and info
				driver.get("https://api.jquery.com/contextmenu/");						// Using this website for rightclick()
				driver.navigate().to("https://testautomationpractice.blogspot.com/");			// Using this website for doubleclick()
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.manage().window().maximize();
				
				// Drag and Drop Concept
				WebElement pick = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
				System.out.println("pick is located : "+pick.isDisplayed());
				WebElement drop = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
				System.out.println("drop is located : "+drop.isDisplayed());
				Actions action = new Actions(driver);
				action.dragAndDrop(pick, drop).build().perform();
				
				WebElement pick1 = driver.findElement(By.xpath("//img[@alt='the peaks of high tatras']"));
				System.out.println("pick1 is located : "+pick1.isDisplayed());
				WebElement pick2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
				System.out.println("pick2 is located : "+pick2.isDisplayed());		
				WebElement drop1 = driver.findElement(By.id("trash"));
				System.out.println("drop1 is located : "+drop1.isDisplayed());
				action.dragAndDrop(pick1, drop1);
				
				action.dragAndDrop(pick1, drop1).build().perform();
		
		
	}

}
