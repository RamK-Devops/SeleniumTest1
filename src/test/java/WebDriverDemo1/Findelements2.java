package WebDriverDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set the chrome driver path, which is optional after 4.nn version
		
		System.setProperty("webdriver.chrome.driver", "..\\SeleniumTest1\\Drivers\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://amazon.in");
		dr.manage().window().maximize();
			
	
		//WebElement Mlink = dr.findElement(By.linkText("Mobiles"));
		//Mlink.click();
		
		//WebElement search = dr.findElement(By.className("nav-input nav-progressive-attribute"));
		//search.clear();
		//search.sendKeys("mobiles");
		
		WebElement Go = dr.findElement(By.id("nav-search-submit-button"));
		Go.click();
		
		//delete cookies
		dr.manage().deleteAllCookies();
		
		//input[@id='email']
	}

}
