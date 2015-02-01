package dropdown;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestElementText {
	WebDriver driver = new FirefoxDriver();

	@Test
	public void test() {
		//Get the message Element
		WebElement message = driver.findElement(By.id("message"));
		//Get the message elements text
		String messageText = message.getText();
		//Verify message element's text displays "Click on me and my 
		// color will change
		
	}

}
