package dropdown;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JustTest2 {
	FirefoxDriver driver;

	String baseUrl ;

	@Before
	public void setUp() throws Exception {

		System.out.println("Hello this is @Before every @Test");
		//Creating an object instance 
		 driver = new FirefoxDriver();
		 baseUrl = "http://www.youtube.com/";
		
	}

	

	@Test
	public void test() throws InterruptedException {
		String iSearchTerm;
		String oSearchResuls;
		iSearchTerm = "QTP";
		int iWait = 3000;
		//all YT related test steps will be performed within this function or method
		//Search go to youtube.com
		driver.get(baseUrl);
		//Search Enter a search term - QTP in the search video field
		//Where part :xPath
		//What part :
		//sendKeys takes the String so value will be in quote
		driver.findElement(By.xpath(".//*[@id='masthead-search-term']")).sendKeys(iSearchTerm);
		Thread.sleep(iWait);
		
		//Search Click the search button or image
		driver.findElement(By.xpath(".//*[@id='search-btn']")).click();
		Thread.sleep(iWait);
		//Search Verify that the results show
		oSearchResuls=driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[1]/div/div[2]/div[1]/div[1]/div/p")).getText();
		Thread.sleep(iWait);
		System.out.println("The search results are "+ oSearchResuls);
		
		
	}
	@After
	public void tearDown() throws Exception {
	}

}
