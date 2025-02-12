package Pack2;

import org.testng.annotations.Test;

public class HandlingTest {
	
  @Test(enabled = false)
  public void Test1() {
	  System.out.println("Running in Test1");
  }
  
  @Test(enabled = true)
  public void Test2() {
	  System.out.println("Running in Test2");
  }
  
  @Test(enabled = false)
  public void Test3() {
	  System.out.println("Running in Test3");
  }
  
  @Test
  public void Test4() {
	  System.out.println("Running in Test4");
  }
  
  @Test(invocationCount = 100)
  public void registration() {
	  System.out.println("Registration - Test");
  }
  
  
}
