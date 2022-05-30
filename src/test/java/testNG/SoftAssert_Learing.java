package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Learing {
	//Step 1 - you will have to create the object of SoftAssert Class
	//Step 2 - Your need to invoke the method assertAll()
	
	@Test
	public void SoftTestCasesValidation() {
		SoftAssert softassert = new SoftAssert();
		System.out.println("I am writing a test script");
		softassert.assertTrue(false); //you are asserting or applying a validation condition that is false
		
		System.out.println("I am writing a Java Logic");
		softassert.assertTrue(true);//you are asserting or applying a validation condition condition that is true
		softassert.assertAll();// SoftAssert will mention all theexeptions within the same test case if at the end of the logic we invoke the method assertALL()
		
	}

}
