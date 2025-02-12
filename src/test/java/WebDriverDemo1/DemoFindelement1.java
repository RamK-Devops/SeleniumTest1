package WebDriverDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFindelement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://facebook.com");
		dr.manage().window().maximize();
		
		WebElement email = dr.findElement(By.id("email"));
	//	email.click();
		email.clear();
		email.sendKeys("Test@gmail.com");
	
		WebElement pass = dr.findElement(By.name("pass"));
	//	pass.click();
		pass.clear();
		pass.sendKeys("Test123");
	
		//WebElement cookies = dr.findElement(By.className("x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft"));
		//cookies.click();
		
		WebElement login = dr.findElement(By.name("login"));
		login.click();
		
		//WebElement forgotPass = dr.findElement(By.linkText("Forgotten password?"));
	//	forgotPass.click();

	}

}
