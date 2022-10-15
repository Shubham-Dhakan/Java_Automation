import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;				// 2 and 3 package both are same, * includes all the files  

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import static org.openqa.selenium.support.locators.RelativeLocator.with;			// and without * it includes specific library

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Environment Setup 
		System.setProperty("webdriver.chrome.driver", "C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Browser Setup & Info 
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	
		// JavaScript Executor Class for scrolling concept
	/*	WebElement label = driver.findElement(By.xpath("//label[text()='Name']"));
		System.out.println(label.isDisplayed());
		System.out.println(label.getText());
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",label);
		
		driver.findElement(with(By.tagName("input")).below(label)).sendKeys("Automated Message from Selenium WebDriver");
	*/	
		// Above Relative Operator 
	/*	WebElement inputBox = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		System.out.println(inputBox.isDisplayed());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",inputBox);
		
		System.out.println("Text is: "+driver.findElement(with(By.tagName("label")).above(inputBox)).getText());
	*/
	/*	// Below Operator 
		WebElement pwd = driver.findElement(By.cssSelector("input#exampleInputPassword1[type='password']"));
		System.out.println(pwd.isDisplayed());
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",pwd);
		
		driver.findElement(with(By.tagName("input")).below(pwd)).click();
	*/
		
		WebElement radioBttnTxt = driver.findElement(By.xpath("//label[text()='Student']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",radioBttnTxt);
		
		driver.findElement(with(By.tagName("input")).toLeftOf(radioBttnTxt)).click();		// For Left Relative Operator 
		driver.findElement(with(By.tagName("input")).toRightOf(radioBttnTxt)).click();		// For Right Relative Operator 
		
		
		
	}

}
