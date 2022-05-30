package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
	
	@Test
	public void Login() {
		System.out.println("This is login Test Case");
		Assert.fail("Deliberatly failing");
	}
	
	@Test(dependsOnMethods = "Login", alwaysRun = true)
	public void LogOut() {
		System.out.println("This is LogOut Test Case");
	}

}
