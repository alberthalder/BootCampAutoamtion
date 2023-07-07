package automation_bootcamp_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verify_Title {
	
	private WebDriver driver;
		 
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome");
	        driver = new ChromeDriver();
	    }

	    @Test
	   public void verifyTitle() {
	       driver.get("https://www.google.com");
	        String expectedTitle = "https://tutorialsninja.com/demo";
	        String actualTitle = driver.getTitle();
	       Assert.assertEquals(actualTitle, expectedTitle);
	    }

		    public void tearDown() {
	        driver.quit();
	    }
	}



		

