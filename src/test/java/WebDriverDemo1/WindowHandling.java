package WebDriverDemo1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set the browser properties
		System.setProperty("webdriver.chrome.driver","..\\SeleniumTest1\\Drivers\\chromedriver.exe");
		
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//browse URL
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//get the current Window
		String WindowId = driver.getWindowHandle();
		System.out.println("Current WindowID: "+WindowId);
		
		//Navigate to flights window
		WebElement Flights = driver.findElement(By.xpath("//a[@aria-label='Menu Flight. Website will be opened in new tab']"));
		Flights.click();

		//get all window ids
		Set<String> WindowIds =driver.getWindowHandles();
		System.out.println("All WindowIDs: "+WindowIds);
		
		//Iterators objects
		Iterator<String> IteratorObj = WindowIds.iterator();
		
		String ParentWindowId = IteratorObj.next();
		
		if (IteratorObj.hasNext())
			System.out.println("Next Flights window id");
		
		String ChildWindowId = IteratorObj.next();
		
		//shift the focus to child window
		
		driver.switchTo().window(ChildWindowId);
		
		if (driver.getCurrentUrl().contains("air")) {
			System.out.println("control in Flight booking page");
			driver.close();
		}
	
		/*
		WebElement origin = driver.findElement(By.xpath("//input[@id='stationFrom']"));
		origin.click();
		origin.clear();
		origin.sendKeys("Mumbai"); */
		
		//switch to parent window
		driver.switchTo().window(ParentWindowId);
		
		WebElement heading = driver.findElement(By.xpath("//label[@class='heading-font']"));
		
		if (heading.isDisplayed()) {
			System.out.println("Control is in Main Page");
		}
		

		
	}

}
