package testNG;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITestContext_Learning {
	//ITestContext is an interface, used in TestNG. It helps to share data within the test-cases which are in a signgle Java file or in the same class
	
	@Test(priority = 1)
	public void switchedOn(ITestContext context) {
		System.out.println("Laptop has been switched on");
		context.setAttribute("LaptopName", "DELL");
		
	}
	@Test(priority = 1, dependsOnMethods = "switchedOn")
	public void operating(ITestContext context) {
		System.out.println("Laptop is operating");
		String LaptopBrand = (String)context.getAttribute("LaptopName");
		System.out.println("The name of the brand is : "+LaptopBrand);
		context.setAttribute("LaptopSpeed", "Very Fast");
		
	}
	@Test(priority = 1, dependsOnMethods = {"switchedOn", "operating"})
	public void switchedOff(ITestContext context) {
		System.out.println("Laptop has been switched off");
		String LaptopPerformance = (String)context.getAttribute("LaptopSpeed");
		System.out.println(LaptopPerformance);
	}

}
