package practicaSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo_Findelements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		//Obtener objetos o web Elements de la pagina web
		WebElement userNameTxt = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.xpath("//input[@data-test='login-button']"));
		
		//Login 
		userNameTxt.sendKeys("standard_user");
		Thread.sleep(1000);
		passwordTxt.sendKeys("secret_sauce");
		Thread.sleep(1000);
		loginBtn.click();
		Thread.sleep(1000); 
		
		//FindElemens nos regresa una lista de todos los web elements que contengan el mismo localizado
		List <WebElement> prodList = driver.findElements(By.className("inventory_item_name"));
		System.out.println("El numero de elementos es: " + prodList.size());
		
		String primerProd = prodList.get(0).getText();
		String segProd = prodList.get(1).getText();
		System.out.println(primerProd);
		System.out.println(segProd);
		
		//Ejemplo consegui muchos de una lista sin ponerlos uno por uno
		
		for (int i = 0; i < prodList.size(); i++) {
			System.out.println("Los Productos son: " + prodList.get(i).getText());
		}
		
		//Opcion de realizalo conn Xpath
		// (//*[@class = 'inventory_item_name '])[1]
		
		//Opcion de cuando buscas que contenga un texto
		// //*[contains(text(),'Sauce')]
		
		//Sirven para igualar
		//primerProd.contains(segProd);
		//primerProd.containsEquals(segProd);
	}

}
  