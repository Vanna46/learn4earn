package testing_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Code {
	public static WebDriver driver;
	
	@BeforeMethod
	public static void initializeWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	@Test
	public void launchRediff() {
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}
	@Test
	public void clickOnSignInLink() {
		driver.findElement(By.className("signin")).click();
	}
	@AfterMethod
	public void tierdown() {
		driver.close();
	}

}
