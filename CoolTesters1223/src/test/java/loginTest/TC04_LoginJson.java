package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationPages.LoginPage;

public class TC04_LoginJson {
	//Declararr inicializar webdriver
	WebDriver driver = DriverSetup.setDriver();
	
	//PageObject
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void startWebPage() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
  @Test
  public void TC01() {
	  String username = WrapClass.getJsonValue("tc04", "username");
	  String pwd = WrapClass.getJsonValue("tc04", "password");
	  
	 loginPage.login(username,pwd);
  }
  @AfterTest
  public void closeDriver() {
	  driver.quit();
      }
  }

