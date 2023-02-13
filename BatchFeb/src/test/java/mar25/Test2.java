package mar25;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Test2 {
  @Test
  public void f() {
	System.out.println("Hello i am from Test1");  
  }
  
  @Test
  public void f2() {
	System.out.println("Hello i am from Test2");  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am from Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am from After Method");
  }

}
