package practicaSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class PruebaSelenium {

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
		
		
		//input[@data-test = 'password']; ejemplo xPath
		
		//Metodos del explorador
		
		//Obtener titulo de la pagina
		String title = driver.getTitle();
		System.out.println("El titulo es: " + title);
		
		//Obtener URL
		String url = driver.getCurrentUrl();
		System.out.println("La Url es: " + url);
		
		//metodos de navegacion, refrescar pagina, el ir atras e ir adelante
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(1000);
		//driver.navigate().refresh();
		
		//Verificar elemento desplegado en la pagina
		boolean prodContainer = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		if(prodContainer) {
			System.out.println("El articulo esta desplegado");
		}
		
		//Obtener Texto
		String prodName = driver.findElement(By.className("inventory_item_name")).getText();
		System.out.println("El producto es: " + prodName);
		
		//TIPO Dropdown filtros tipo dentro de uan tienda para ordenar productos
		driver.manage().window().maximize();//Maximizar la ventana del navegador
		//Select drpdwnProdSelect = new Select(driver.findElement(By.className("product_sort_container")));
		//drpdwnProdSelect.selectByVisibleText("Price (low to high)");
		//drpdwnProdSelect.selectByValue("lohi");
		
		WebElement addBtnSlb = driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"));
	
		addBtnSlb.click();
		Thread.sleep(1000); 
		
		WebElement carBtn = driver.findElement(By.className("shopping_cart_link"));
		carBtn.click();
		Thread.sleep(1000);
		
		WebElement checkBtn = driver.findElement(By.name("checkout"));
		checkBtn.click();
		Thread.sleep(1000);
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Patricio");
		Thread.sleep(1000);
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Rodriguez");
		Thread.sleep(1000);
		
		WebElement zipCode = driver.findElement(By.name("postalCode"));
		zipCode.sendKeys("222");
		Thread.sleep(1000);
		
		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
		Thread.sleep(1000);
		
		WebElement finishBtn = driver.findElement(By.id("finish"));
		finishBtn.click();
		Thread.sleep(1000);
		
		boolean completeTitle = driver.findElement(By.className("complete-header")).isDisplayed();
		if(completeTitle) {
			System.out.println("La orden se logro completar correctamente");
		}
		//Cerrar Navegador web
		//driver.close(); //cierra ventana actual
		//driver.quit(); //cierra todas las ventanas
	}

}
