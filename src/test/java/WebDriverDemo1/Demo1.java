package WebDriverDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch light browser
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://facebook.com");
		driver1.manage().window().maximize();
		
		driver1.navigate().to("https://amazon.in");
		
		driver1.navigate().to("https://bbc.com");
		
		driver1.navigate().back();
		
		String currentURL = driver1.getCurrentUrl();
		System.out.println("Current URL: "+currentURL);
		
		String currentTitle = driver1.getTitle();
		System.out.println("Current Title: "+currentTitle);
		
		//delete cookies
		driver1.manage().deleteAllCookies();
		
		//refresh the page
		driver1.navigate().refresh();
		
		// quit the browser
		driver1.quit();
		
	}

}
