package commonClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class WrapClass {

	public static void click(WebElement webelementUI) {
		webelementUI.click();
	}
	
	public static void sendKeys(WebElement webelementUI, String text) {
		webelementUI.sendKeys(text);
    }
	
	public static String getText(WebElement webelementUI) {
		return webelementUI.getText();
	}
	
	public static boolean verifyElementDisplayed(WebElement webelementUI) {
	return webelementUI.isDisplayed();
	}
	
	public static void takeScrenshot (WebDriver webdriver, String testCaseName) {
		//Tomar screenshot de la pagina
		File scrFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		
		//La ruta donde se va a guardar el screenshot
		String screenshotPath = "./test-output/ExecutionResults";
		
		//Creamo el Folder usando la ruta especificada de la variable screenshotpath
		FileHandler.createDir(new File(screenshotPath));
		try {
		FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getJsonValue(String jsfileObj, String jsonKey) {
		
		try {
			InputStream inputStream = new FileInputStream(GlobalVariables.TEST_DATA + jsfileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
			
			String jsonValue = (String) jsonObject.getJSONObject(jsfileObj).getString(jsonKey);
			return jsonValue;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}