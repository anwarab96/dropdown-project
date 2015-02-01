package dropdown;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JustATest5 {
           FirefoxDriver driver;
           String baseUrl;
	@Before
	public void setUp() throws Exception {
	
		driver = new FirefoxDriver();
		baseUrl = "http://www.youtube.com/";
	}
	@Test
	public void test() throws Exception {
		String iSearchTerm;
		String oSearchResults;
		iSearchTerm = "QTP";
		driver.get(baseUrl);
		Thread.sleep(2000);
		//Search Enter a search term = "QTP" in the search video field
		//Where part: xpath is ".//*[@id='masthead-search-term']"
		//What part: 	enter text into it.	
		driver.findElement(By.xpath(".//*[@id='masthead-search-term']")).sendKeys("QTP");
	//Or we can use like:	driver.findElement(By.xpath(".//*[@id='masthead-search-term']")).sendKeys(iSearchTerm);
		//Search Click the search button or image
		driver.findElement(By.xpath(".//*[@id='search-btn']")).click();
		//Search Verify that the results show
		driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[1]/div/div[2]/div[1]/div[1]/div/p")).getText();	
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
