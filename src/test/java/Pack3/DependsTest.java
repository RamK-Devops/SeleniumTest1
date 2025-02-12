package Pack3;

import org.testng.annotations.Test;

public class DependsTest {
	
  @Test(dependsOnMethods = "Test3")
  public void Test1() {
	  System.out.println("@Test1");
  }
  
  @Test(dependsOnMethods = "Test1")
  public void Test2() {
	  System.out.println("@Test2");
  }
  
  @Test
  public void Test3() {
	  System.out.println("@Test3");
  }
  
}
