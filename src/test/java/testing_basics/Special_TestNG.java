package testing_basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Special_TestNG {
	@BeforeMethod
	public void init() {
		System.out.println("This is the before method annotation");
	}
	
	@Test
	public void test1() {
		System.out.println("This is first test case");
	}
	
	@Test
	public void test2() {
		System.out.println("This is second test case");
	}
	
	@Test
	public void test3() {
		System.out.println("This is third test case");
	}
	
	@AfterMethod
	public void end() {
		System.out.println("This is the after method annotation");
	}

}
