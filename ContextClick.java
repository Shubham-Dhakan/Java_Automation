import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
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
		
		/*// Frames concept 
		WebElement rightclick = driver.findElement(By.xpath("//div[@class='contextmenu']"));
		//System.out.println(rightclick.isDisplayed()+": rightclick is displayed");
		driver.switchTo().frame(rightclick);
		
		Actions action = new Actions(driver);
		action.contextClick(rightclick).build().perform();
		action.doubleClick()
		*/
		
		// Slider concept 
		WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println("slider is selected: "+slider.isDisplayed());
		Actions action = new Actions(driver);
		action. dragAndDropBy(slider, 300, 0).build().perform();
	}

}
