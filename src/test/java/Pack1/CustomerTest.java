package Pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CustomerTest {
  @Test
  public void createCustomerTest() {
	  System.out.println("@Test - create test and verify the customer");
  }
  
  
  @Test
  public void ModifyCustomerTest() {
	  System.out.println("@Test - Modify customer");
  }
  
  @BeforeMethod
  public void loginToApp() {
	  System.out.println("@BeforeMethod - log in to the application");
  }
  
  @AfterMethod
  public void logoffApp() {
	  System.out.println("@AfterMethod - logout of the application");
  }
  
  
  @BeforeClass
  public void launchBrowser() {
	  System.out.println("@BeforeClass - Launch the browser");
  }
  
  @AfterClass
  public void CloseBrowser() {
	  System.out.println("@AfterClass - Close browser");
  }
  
  @BeforeSuite
	public void setupDBConnection() {
		System.out.println("@BeforeSuite - Establish a database connection ");
	}
  
  @AfterSuite
  public void diconnectDB() {
		System.out.println("@AfterSuite - Disconnect DB and clear the Db object");
  }
  
  
}
