package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	public static WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	@Test
	public void launchDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}
	
	@Test
	public void testNGValidations() throws Exception {
		softassert.assertEquals(driver.findElement(By.className("signin")).isEnabled(), true);
		driver.findElement(By.className("signin")).click();
		
		softassert.assertEquals(driver.findElement(By.id("login1")).isEnabled(), true);
		driver.findElement(By.id("login1")).sendKeys("seleniumpands@rediffmail.com");
		
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
