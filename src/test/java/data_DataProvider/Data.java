package data_DataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data {
	
	@DataProvider
	public static Object[][] getData(Method name){
		System.out.println("Test Case which has the method is: "+name.getName());

		Object[][]data = new Object[3][4];   
		
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
