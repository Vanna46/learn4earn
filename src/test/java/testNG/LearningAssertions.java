package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningAssertions {
	
	@Test
	public void Learing_AssertEquals(){
	
	String actual = "My name is Vandna SOdhi";
	String expected = "I am learing Java";
	
	Assert.assertEquals(actual, expected);
	}

}
