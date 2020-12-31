package testngtest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeTest
	
	public void beforeTest() {
		System.out.println("running before test");
		
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("running after test");
	}
	
  @Test (groups = {"regression"})
  public void printName() {
	  
	  System.out.println("My name is Priya");
  }
}
