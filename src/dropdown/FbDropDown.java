package dropdown;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropDown {
	String URL= "https://www.facebook.com/";
	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Select mon = new Select(driver.findElement(By.id("month")));
		mon.selectByIndex(7);
		Thread.sleep(2000);
		mon.selectByValue("5");
		Thread.sleep(2000);
		mon.selectByVisibleText("Dec");
		Thread.sleep(2000);
		driver.quit();
		
	}
	

}
