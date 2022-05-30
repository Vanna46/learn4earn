package testNG;

import org.testng.annotations.Test;

public class OnlyTestCases_NoOtherTestNGAssertions {
	
	@Test
	public void launchBrowser() {
		System.out.println("This Test case is about browser launch");
	}
	
	@Test
	public void loginTest() {
		System.out.println("This is a login Test Case");
	}
	
	@Test
	public void HomePageValidationTest() {
		System.out.println("This is a Home Page Validation Test");
	}
	
	@Test
	public void Logout() {
		System.out.println("This is a Logout test case");
	}

}
