package testing_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Concepts_dataProvider {
	
	@Test(dataProvider = "getData") //Step3 = link the test case with dataProvider = "name of the method in the DataProvider"
	public void RegisterUser(String User, String browser, String PanNo, int ID) {//no. of input parameters = no. of cols
		
	}

	
	@DataProvider //it returns a 2 dimensional array
	public Object[][] getData() {
		
		Object[][]data = new Object[3][4]; //enter data as per rows and cols
		
		data[0][0] = "User1";
		data[0][1] = "Chrome";
		data[0][2] = "Usd123";
		data[0][3] = 121;
		
		data[1][0] = "User2";
		data[1][1] = "Edge";
		data[1][2] = "Usd1234";
		data[1][3] = 123;
		
		data[2][0] = "User3";
		data[2][1] = "IE";
		data[2][2] = "Usd12345";
		data[2][3] = 124;
		return data;
		
	}

	}

