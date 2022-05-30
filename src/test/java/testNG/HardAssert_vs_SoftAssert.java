package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert_vs_SoftAssert {
	
	@Test
	public void HardAssertionsLogic() {
		System.out.println("This is my first statement");
		Assert.assertTrue(true);
		
		int i = 100; int j = 50;
		System.out.println("The sum is "+(i+j));
		Assert.assertTrue(false);
		
		System.out.println("This is my last logic in HardAssertions Logic test case");
		Assert.assertTrue(true);
	}
	
	@Test
	public void SoftAssertionsLogic() {
		SoftAssert softassert = new SoftAssert();
		System.out.println("This is my first softassert statement logic");
		softassert.assertTrue(true);
		
		int k = 100; int l = 99;
		System.out.println("The substracted value "+(k-l));
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 == b2);
		softassert.assertEquals(b1, b2);
		
		softassert.assertAll();
		
	}
	

}
