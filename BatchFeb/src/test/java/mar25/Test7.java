package mar25;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test7 {
  @Test
  public void f() {
	  System.out.println("I am from Test1 123");
  }
  
  @Test
  public void f2() {
	  System.out.println("I am from Test2 456");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am from before Test abc");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am from after Test xyz");
	  
  }
  
  

}
