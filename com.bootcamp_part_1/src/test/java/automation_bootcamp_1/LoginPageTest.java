package automation_bootcamp_1;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest {
 
	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@Test
	public void verifyingLoginWithValidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("albert_halder@yahoo.com");
		driver.findElement(By.id("input-password")).sendKeys("Joy4tune!");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
	}
		@Test(invocationCount = 5)
	public void verifyingLoginWithInvalidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("albert_halder" + dateTimeStamp() + "@yahoo.com");
		driver.findElement(By.id("input-password")).sendKeys("Joy4tune!");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage), "Something is not validated");
		softassert.assertAll();
	}
		public String dateTimeStamp() {
		Date date = new Date();
		return date.toString().replace(" ", "_").replace(":", "_");
			}
		@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}



