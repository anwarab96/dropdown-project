package dropdown;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaTest3 {
	FirefoxDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		//Main @Before code
		System.out.println("Hello this is @Before every @Test");
		driver = new FirefoxDriver();
		baseUrl = "http://www.google.com/";
	}
	
	@Test
	public void test() throws InterruptedException  {
		String iSearchTerm;
		String oSearchReasults;
		iSearchTerm = "BANGLADESH";
		int iWait = 5000;
		//All Google related test steps will be performed within this function or method 
		// Search Go To google.com
		driver.get(baseUrl);
		// Where part: xpath is "//input[@id ='masthead-search-term']"
				//What part : enter text into it.
		//Search Enter a search term - BANGLADESH in the search video field
		//driver.findElement(By.cssSelector("#lst-ib")).sendKeys(iSearchTerm);
		driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys(iSearchTerm);
		Thread.sleep(iWait);
		//Click the Search button.
		driver.findElement(By.xpath(".//*[@id='gbqfb']")).click();
		Thread.sleep(iWait);
		//Search out put results and get Text.
		oSearchReasults=driver.findElement(By.xpath(".//*[@id='resultStats']")).getText();
		Thread.sleep(iWait);
		System.out.println(oSearchReasults);
		
		
	}
	

	@After
	public void tearDown() throws Exception {
	}


}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
