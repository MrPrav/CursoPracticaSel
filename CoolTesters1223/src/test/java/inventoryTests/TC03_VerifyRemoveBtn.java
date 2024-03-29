package inventoryTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationPages.InventoryPage;
import navigationPages.LoginPage;

public class TC03_VerifyRemoveBtn {
	//Declararr inicializar webdriver
	WebDriver driver = DriverSetup.setDriver();
	
	//PageObject
	LoginPage loginPage = new LoginPage(driver);
	InventoryPage inventory = new InventoryPage(driver);
	
	@BeforeTest
	public void startWebPage() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
  @Test
  public void TC03() {
	 loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.STANDAR_PASSWORD);
	 boolean isBtnDisplayed = inventory.addToCartAnVerifyRemoveBtn();
	 Assert.assertTrue(isBtnDisplayed);
  }
  @AfterTest
  public void closeDriver() {
	  //driver.quit();
      }
  }

