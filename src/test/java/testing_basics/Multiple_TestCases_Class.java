package testing_basics;

import org.testng.annotations.Test;

import data_DataProvider.DataRepo;

public class Multiple_TestCases_Class {
	
	@Test(dataProviderClass = DataRepo.class, dataProvider = "getData")
	public void launchURL(String User, String browser, String PanNo, int ID) {
		
	}
	@Test(dataProviderClass = DataRepo.class, dataProvider = "getData")
	public void enterCredentials(String User, String browser, String PanNo, int ID) {
		
	}
	@Test(dataProviderClass = DataRepo.class, dataProvider = "getData")
	public void validateLoginHomePage(String User, String browser, String PanNo, int ID) {
		
	}
	@Test(dataProviderClass = DataRepo.class, dataProvider = "getData")
	public void logOut(String User, String browser, String PanNo, int ID) {
		
	}

}
