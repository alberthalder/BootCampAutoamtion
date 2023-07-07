package automation_bootcamp_1;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.it.E;

public class AddToShoppingCart {
	
	public static void main (String [] args ) {
	
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver (options);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("i phone 13 ");	
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		driver.get("https://www.amazon.com/Apple-iPhone-13-128GB-Blue/dp/B09LNX6KQS/ref=sr_1_3?crid=7J6C7OR47LWE&keywords=iphone+13&qid=1688407417&sprefix=iphone+13%2Caps%2C115&sr=8-3");
		
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		
			
	}
}