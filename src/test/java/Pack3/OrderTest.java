package Pack3;

import org.testng.annotations.Test;

public class OrderTest {
	
  @Test(priority = 2)
  public void A() {
	  System.out.println("@Test - Method A");
  }
  
  @Test(priority = 1)
  public void B() {
	  System.out.println("@Test - Method B");
  }
  
  @Test(priority = 4)
  public void C() {
	  System.out.println("@Test - Method C");
	  
  }
  
  @Test (priority = 3)
  public void D() {
	  System.out.println("@Test - Method D");
	  
  }
}
