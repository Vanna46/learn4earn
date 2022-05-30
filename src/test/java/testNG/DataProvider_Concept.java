package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Concept {
	//parameterization - validating a single test case with multiple sets of data
	//login()- u1/p1, u2/p2, u3/p3
	
	@Test(dataProvider = "getData")//Step3 - linking the test data with dataprovider
	public void RegisteringNewUser(String username, String browser, int mobile, String email) {
		//Step4 - no. of input parameters = no. of coloumns
		
	}
	
	@DataProvider
	public Object[][] getData(){             //Step1 - returns a 2 dimensional Object array
		Object[][]data = new Object[3][4];   //[rows][cols]
		
		data[0][0] = "User1";                //Step2 - enter data as per rows/cols
		data[0][1] = "Chrome";
		data[0][2] = 1234567890;
		data[0][3] = "Demo@123.com";
		
		data[1][0] = "User2";
		data[1][1] = "Chrome1";
		data[1][2] = 1234567890;
		data[1][3] = "Demo@123.com";

		data[2][0] = "User3";
		data[2][1] = "Chrome3";
		data[2][2] = 1234567890;
		data[2][3] = "Demo@123.com";
		
		return data;
	}

}
