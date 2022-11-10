package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pojo.Browser;
import pom.SwagLabsLoginPage;
import utility.BaseClass;
import utility.Parameterization;

@Listeners (utility.Listeners.class)
public class SwagLabsLoginTest extends BaseClass {
	
	
	
	@BeforeMethod
	public void launchBrowser() {
		
		driver = Browser.openBrowser(); 
	}
	
	@Test ()
	public void loginWithValidCredentials() throws InterruptedException, EncryptedDocumentException, IOException {
	
		SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(driver);
		
		String user = Parameterization.getExelData("credentials",0,0);
		swagLabsLoginPage.enterUsername(user);
	   
	    String pass = Parameterization.getExelData("credentials",1,0);
	    swagLabsLoginPage.enterPassword(pass);
	  
		swagLabsLoginPage.clickOnLogin();
//		String actualUrl = driver.getCurrentUrl();
//		String expectedUrl = "https://www.saucedemo.com/inventory.htm";
//		Assert.assertEquals( actualUrl, expectedUrl);
		
	
}

//	@Test ()
//	public void loginWithInvalidUsername() throws InterruptedException, EncryptedDocumentException, IOException {
//	
//		SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(driver);
//	
//		swagLabsLoginPage.enterUsername("masterpiece");
//	
//	    swagLabsLoginPage.enterPassword("secret_sauce");
//		
//		swagLabsLoginPage.clickOnLogin();
//		Thread.sleep(8000);
//		driver.close();
//}
//	
//	
//	@Test ()
//	public void loginWithInvalidPassword() throws InterruptedException, EncryptedDocumentException, IOException {
//	
//		SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(driver);
//		Thread.sleep(2000);
//		swagLabsLoginPage.enterUsername("standard_user");
//	    Thread.sleep(2000);
//	    swagLabsLoginPage.enterPassword("secret_saucage");
//		Thread.sleep(2000);
//		swagLabsLoginPage.clickOnLogin();
//		Thread.sleep(8000);
//		driver.close();
//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
