package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_SoftAssert {
	public static WebDriver driver;
	SoftAssert softassert;
	
	@Test
	public void launchDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		
	}
	@Test
	public void testNGValidation() throws Exception {
		softassert.assertTrue(driver.findElement(By.className("signin")).isEnabled());
		driver.findElement(By.className("signin")).click();
		
		softassert.assertEquals(driver.findElement(By.id("login1")).isEnabled(), true);
		driver.findElement(By.id("login1")).sendKeys("Seleniumpanda@rediffmail.com");
		
		softassert.assertEquals(driver.findElement(By.id("password")).isEnabled(), true);
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
		softassert.assertEquals(driver.findElement(By.className("signinbtn")).isEnabled(), true);
		driver.findElement(By.className("signinbtn")).click();
		
		Thread.sleep(2000);
		softassert.assertEquals(driver.findElement(By.className("rd_logout")).isEnabled(), true);
		driver.findElement(By.className("rd_logout")).click();
		
		Thread.sleep(2000);
		softassert.assertEquals(driver.findElement(By.xpath("//b[text() = 'Rediff Home']")).isEnabled(), true);
		driver.findElement(By.xpath("//b[text() = 'Rediff Home']")).click();
		
		softassert.assertAll();
		
		
	}

}
