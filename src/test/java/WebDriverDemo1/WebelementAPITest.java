package WebDriverDemo1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementAPITest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//set the browser properties
		System.setProperty("webdriver.chrome.driver","..\\SeleniumTest1\\Drivers\\chromedriver.exe");
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximise the application
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
	//	Thread.sleep(3000);
		
		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//Get Email Webelement 
		WebElement email = driver.findElement(By.id("email"));
	//	email.click();
		email.clear();
		email.sendKeys("test@gmail.com");
		
		WebElement Password = driver.findElement(By.name("pass"));
		Password.clear();
		Password.sendKeys("Test123");
		
	//	WebElement Login = driver.findElement(By.xpath("//button[@id='u_0_5_JC']"));
	//	WebElement Login = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	//	Login.click();
		
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: "+currentURL);
		
		//get all window ids
		Set<String> WindowIds =driver.getWindowHandles();
		System.out.println("All WindowIDs: "+WindowIds);
		
     //   driver.quit();
	}

}
