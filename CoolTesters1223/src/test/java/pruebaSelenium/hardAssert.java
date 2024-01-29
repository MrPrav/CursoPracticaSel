package pruebaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssert {
  @Test
  public void f() {
	  
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";
		
		Assert.assertEquals(actualTitle, expectedTitle);

	  //int a = 1;
	  //int b = 1;
	  
	  //boolean istrue = true;
	  
	  //Assert.assertTrue(istrue);
  }
}
