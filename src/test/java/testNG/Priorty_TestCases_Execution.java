package testNG;

import org.testng.annotations.Test;

public class Priorty_TestCases_Execution {
	
	@Test(priority = 4)
	public void Apple() {
		System.out.println("This test case is having alphabet A");
	}
	@Test(priority = 1)
	public void Ballon() {
		System.out.println("This test case is having alphabet B");
	}
	@Test(priority = 3)
	public void Coding() {
		System.out.println("This test case is having alphabet C");
	}
	@Test(priority = 2, enabled = false)
	public void Zebra() {
		System.out.println("This test case is having alphabet Z");
	}

}
