package dropdown;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JustATest
{	FirefoxDriver driver;

	String baseUrl ;
	
	@Before
	public void setUp() throws Exception
	{
		System.out.println("Hello this is @Before every @Test");
		//Creating an object instance 
		 driver = new FirefoxDriver();
		 baseUrl = "http://www.youtube.com/";
		String v1 = "Anwara";
				System.out.println(v1);
				v1 = "Mohiuddin";
				System.out.println(v1);
				// baseUrl = "http://www.youtube.com/";
				System.out.println(baseUrl);
				String s1 = "HI every one";
				String s2= "Lets do coding";
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(s1 + " " + s2);
				Thread.sleep(5000);
	}

	@Test
	public void test1() throws Exception
	{
		
		//String baseUrl;
		
//		System.out.println("Hello this is @Test1 ");
//		System.out.println(baseUrl);
		driver.get(baseUrl + "/");
		Thread.sleep(5000);
	}
	
//	@Test
//	public void test2() 
//	{
//		System.out.println("Hello this is @Test2 ");
//	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Hello this is @After every @Test");
		driver.quit();
	}

}
