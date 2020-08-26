package testCases;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class BankLogin extends TestBase {

	@Test
	public void login() {
		log.info("trying to click bank login button");
		log.info("page title b4R clicking the link is "+driver.getTitle());
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("bmllogin"))), "pls check id");
       	driver.findElement(By.cssSelector(OR.getProperty("bmllogin"))).click();
       	log.info("page title after clicking the link is "+driver.getTitle());
		}
	

}
