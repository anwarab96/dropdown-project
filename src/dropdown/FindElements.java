package dropdown;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElements {
		WebDriver driver = new FirefoxDriver();
		
	@Test
	public void test() throws InterruptedException {
		driver.get("http://www.facebook.com");
		//Get all the links displayed on page
		//Select day = new Select(driver.findElement(By.id("day")));
		List <WebElement> links = driver.findElements(By.tagName("a"));
		//verify there are 17 links displayed on the page
		assertEquals(42, links.size());
		//iterate through the list of days and print
		//target for each link
		for(WebElement link: links);
	System.out.println(" href");
	Thread.sleep(2000);

	}

}
