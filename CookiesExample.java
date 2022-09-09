import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CookiesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Environment setup 
		System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Browser Setup and info 
		driver.get("https://demoqa.com/automation-practice-form");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));				// global implicit wait
		
		Set <Cookie> cookies=driver.manage().getCookies();				// Capturing all cookies
		System.out.println(" Get Cookie size is : "+cookies.size());    // 5 --> printing total size of cookie
	
		/*
		// Cookies Concept 1) --> GET COOKIES 
		Set <Cookie> cookies=driver.manage().getCookies();				// Capturing all cookies
		System.out.println(" Get Cookie size is : "+cookies.size());								// 5 --> printing total size of cookie
		
		for (Cookie c:cookies) {
			System.out.println(c.getName()+":"+c.getValue());			// c.getName()+":"+c.getValue() 
																		// Name (of cookie)   +":"+ (append concept) value (of cookie)	
		*/
					
		// Cookies Concept 2) --> getCookieNamed
		System.out.println("GetCookieNamed data : "+driver.manage().getCookieNamed("_gid"));		// Gives detail of specific cookie			
					
					// Cookies Concept 3) --> addCookie
					Cookie c1 = new Cookie("Myid12345","12312432sdf");
					driver.manage().addCookie(c1);
							
							for (Cookie c2:cookies) {
								System.out.println(c2.getName()+":"+c2.getValue());
									}
									System.out.println("Cookies size after adding 1 cookie : "+driver.manage().getCookies().size());
									 
		// Cookie Concept 4) --> Delete Cookie
		driver.manage().deleteCookie(c1);
		for (Cookie c3:cookies) {
			System.out.println(c3.getName()+":"+c3.getValue());
		}
		System.out.println("cookies size after deleting 1 cookie : "+driver.manage().getCookies().size());							
									
		
		// Cookie Concept 5) --> Delete All Cookie
		driver.manage().deleteAllCookies(); 				// Deletes All Cookies 
		System.out.println("cookies size after deleting all cookies : "+driver.manage().getCookies().size());							
		
		
		}															
		
	}


