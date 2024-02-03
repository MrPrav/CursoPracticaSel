package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationPages.LoginPage;

public class TC02_Login_Lock {
	//Declararr inicializar webdriver
	WebDriver driver = DriverSetup.setDriver();
	
	//PageObject
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void startWebPage() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
  @Test
  public void TC02() {
	 loginPage.login(GlobalVariables.LOCK_USER, GlobalVariables.STANDAR_PASSWORD);
	 boolean error = loginPage.validateLockedError();
	 Assert.assertTrue(error);
  }
  @AfterTest
  public void closeDriver() {
	  driver.quit();
      }
  }

