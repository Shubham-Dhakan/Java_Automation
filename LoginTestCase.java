/*Test Case
1) Open browser
2) Open URL		
3) Enter User Name
4) Click on OK
5) Check the Page title
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Web Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();		// This will open the chrome browser
													// Through this method we can open any browser
		
		//ChromeDriver driver = new ChromeDriver();  Over here we are hardcoding it for chrome browser only.
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();		// It will maximize the window
		
		WebElement Username = driver.findElement(By.name("user-name"));	// Using By	Locator
		Username.sendKeys("standard_user");								// Using sendkeys to send value
		
		WebElement Password = driver.findElement(By.name("password"));	// Using By Locator 
		Password.sendKeys("secret_sauce");								// Using sendkeys to send value
		
		WebElement LoginButton = driver.findElement(By.name("login-button"));
		LoginButton.click();											// Using click() function to press login button
		
		String exp_webtitle = "Swag Labs";
		String act_webtitle = driver.getTitle();
		
		//if (exp_webtitle.equals(act_webtitle)) 
			if (exp_webtitle.equals(act_webtitle)) 
		{
			System.out.println("Login test case is passed");
		}
		else
		{
			System.out.println("Login test case is failed");
		}
		
			driver.close();					// Closes the current browser
		
	}

}
