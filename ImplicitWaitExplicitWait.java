/*import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImplicitWaitExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Environment Setup
		System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		// Browser Info and Setup
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));				// GLobal Implicit wait 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");	// username (inputbox element)	
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");				// password (inputbox element)
		
		// radio button 
		WebElement radiobutton = driver.findElement(By.xpath("(//span[@class='checkmark'])[2]"));		// Index xpath condition 
		System.out.println("radiobutton is visible : "+radiobutton.isDisplayed());
		System.out.println("radiobutton is selected : "+radiobutton.isSelected());
		radiobutton.click();
	
		// DropDown 
		WebElement dd = driver.findElement(By.cssSelector("select.form-control"));
		Select select = new Select(dd);
		select.selectByVisibleText("Consultant");
		
		
		// CheckBox 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='terms']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#signInBtn[type=submit]"))).click();
		
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link.btn.btn-primary']")));
		
	//	String[] mobiles = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};
		List <WebElement> buttons = driver.findElements(By.xpath("//button[text()='Add ']"));
		
		for(int i=0;i<buttons.size();i++) {
			buttons.get(i).click();
				}
		driver.findElement(By.xpath("//a[@class='nav-link.btn.btn-primary']")).click();
			
	
	}
} */

import java.time.Duration;

import java.util.List;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;







import org.openqa.selenium.Keys;







import org.openqa.selenium.WebDriver;







import org.openqa.selenium.WebElement;







import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;







public class ImplicitWaitExplicitWait {







public static void main(String[] args) throws InterruptedException {









System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");







WebDriver driver=new ChromeDriver();







driver.get("https://rahulshettyacademy.com/loginpagePractise/");





driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");

driver.findElement(By.id("password")).sendKeys("learning");

driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

//Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

driver.findElement(By.id("okayBtn")).click();

WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));

Select dropdown = new Select(options);

dropdown.selectByValue("consult");

driver.findElement(By.id("signInBtn")).click();







wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

for(int i =0;i<products.size();i++)

{

products.get(i).click();

}

driver.findElement(By.partialLinkText("Checkout")).click();}







}

