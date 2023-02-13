package mar25;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test8 {
  @Test
  public void f() {
	  System.out.println("i am from Test1");
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am from before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am from after suite");
  }

}
