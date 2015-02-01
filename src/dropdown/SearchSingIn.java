package dropdown;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchSingIn {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Hello the SELENIUM world ");
		driver= new FirefoxDriver();
		baseUrl = "http://www.youtube.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void testSearchSignIn()throws Exception {
		System.out.println("This is the first test");
		driver.get(baseUrl + "/");
		driver.findElement(By.id("masthead-search-term")).clear();
		driver.findElement(By.id("masthead-search-term")).sendKeys("QTP");	
		driver.findElement(By.id("search-btn")).click();
		//ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		//driver.findElement(By.linkText("Movies")).click();
		//driver.findElement(By.linkText("Upload")).click();
		}
	@After
	public void tearDown() throws Exception {
	}

}
