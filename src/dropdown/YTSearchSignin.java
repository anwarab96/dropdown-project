package dropdown;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YTSearchSignin {
	private WebDriver driver;
	private String baseUrl;
	@Before
	public void setUp(){
		System.out.println("Hello this is @Before every @Test");
		driver = new FirefoxDriver();
		baseUrl = "http://www.youtube.com/";
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void testYTSearchSignin() throws Exception {
		System.out.println("Hello this is @Test");
		driver.get(baseUrl + "/");
		driver.findElement(By.id("masthead-search-term")).click();
		driver.findElement(By.id("masthead-search-term")).sendKeys("QTP");
		driver.findElement(By.id("search-btn")).click();
		//Error: Caught exception [Error: Unsupported command [isTextPresent]]
		//driver.findElement(By.linkText(" Movies")).click();
		driver.findElement(By.linkText("Upload")).click();
		driver.findElement(By.xpath(".//*[@id='Email']")).clear();
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("hellowelcome");
		driver.findElement(By.xpath(".//*[@id='Passwd']")).clear();
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("xxxxxxxxxxx");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
	}

}
