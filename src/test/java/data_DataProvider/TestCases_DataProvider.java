package data_DataProvider;

import org.testng.annotations.Test;

public class TestCases_DataProvider {
	
	@Test(dataProviderClass = Data.class, dataProvider = "getData")
	public void addUser(String username, String browser, int mobile, String email) {
		
	}
	@Test(dataProviderClass = Data.class, dataProvider = "getData")
	public void registerUser(String username, String browser, int mobile, String email) {
		
	}
	@Test(dataProviderClass = Data.class, dataProvider = "getData")
	public void deleteUser(String username, String browser, int mobile, String email) {
		
	}

}
