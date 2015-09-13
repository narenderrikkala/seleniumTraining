/**
 * 
 */
package nopcommerce.steps;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Rahul Naidu
 *
 */
public class HomePage {

	WebDriver webdriver;

	@Before
	public void startBrowser() {
		webdriver = new FirefoxDriver();

	}

	
	public void navigateToHomepage() throws InterruptedException {
		webdriver.navigate().to("http://demo.nopcommerce.com/");
		webdriver.manage().window().maximize();
		Assert.assertEquals("http://demo.nopcommerce.com/", webdriver.getCurrentUrl());
	
	}
	
	private void signIn() {
		webdriver.findElement(By.linkText("login"));
		Assert.assertEquals("http://demo.nopcommerce.com/login", webdriver.getCurrentUrl());

	}

	@After
	public void closeBrowser() {
        webdriver.close();
		webdriver.quit();

	}

}
