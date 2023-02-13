package mar25;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test3 {
  @Test
  public void f() {
	  System.out.println("I am from Test1");
  }
  
  @Test
  public void f2() {
	  System.out.println("I am from Test2");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am from Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am from After class");
  }

}
