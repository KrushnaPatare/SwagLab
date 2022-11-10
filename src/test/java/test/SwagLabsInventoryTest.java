package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import pojo.Browser;
import pom.SwagLabsLoginPage;

	public class SwagLabsInventoryTest {
		
		
		WebDriver driver;
		
		@BeforeMethod()
		
		public void openInventorypage() throws InterruptedException {
			
			driver = Browser.openBrowser();
			
			SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(driver);
			
			swagLabsLoginPage.enterUsername("masterpiece");
		
		    swagLabsLoginPage.enterPassword("secret_sauce");
			
			swagLabsLoginPage.clickOnLogin();
			
		    Thread.sleep(1000);
		}
		
		
		
		
		
		
		
	
	}
