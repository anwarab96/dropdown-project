package dropdown;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3A {
	FirefoxDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.out.println("Hello this is @Before every @Test");
		driver = new FirefoxDriver();
		baseUrl = "http://www.youtube.com/";
	}
	@Test
	public void test() throws Exception {
		String iSearchTerm;
		String oSearchReasults;
		iSearchTerm = "SELENIUM";
		int iWait = 3000;
		//All YT related test steps will be performed within this function or method 
		// Search Go To youtube.com
		driver.get(baseUrl);
		//Search Enter a search term - QTP in the search video field
		driver.findElement(By.xpath(".//*[@id='masthead-search-term']")).sendKeys(iSearchTerm);
		Thread.sleep(iWait);
		// Where part: xpath is "//input[@id ='masthead-search-term']"
		//What part : enter text into it.
		//Click to Search button.
		driver.findElement(By.xpath(".//*[@id='search-btn']")).click();
		Thread.sleep(iWait);
		// Search and get Text from output Results.
		oSearchReasults=driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[1]/div/div[2]/div[1]/div[1]/div/p")).getText();
		Thread.sleep(iWait);
		System.out.println("The search results are "+ oSearchReasults);
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
