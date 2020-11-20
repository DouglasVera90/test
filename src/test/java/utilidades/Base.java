package utilidades;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base {
	WebDriver driver;

	public Base(WebDriver driver) {
		this.driver = driver;
	}
		
	public WebDriver ConexionChromeDriver(){
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebElement buscarElementoWeb(By localizador){
		
		return driver.findElement(localizador);
	}
	
	public WebElement buscarElementoWebConEspera(By localizador){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.elementToBeClickable(localizador));
	}
	
	public List<WebElement> buscarElementosWeb(By localizador){
		return driver.findElements(localizador);
	}
	
	public String obtenerTexto(WebElement elementoWeb){
		return elementoWeb.getText();
	}
	
	public String obtenerTexto(By localizador){
		return driver.findElement(localizador).getText();
	}
	
	public void agregarTexto(String imput, By localizador){
		driver.findElement(localizador).sendKeys(imput);
	}
	
	public void click(By localizador){
		driver.findElement(localizador).click();
	}
	
	public Boolean estaDesplegado(By localizador){
		try {
			return driver.findElement(localizador).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
		
	}
	
	public void visitarSitio(String url){
		driver.get(url);
	}
	
	public void esperarElemento(int segundos){
		driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);
	}
	
	public void esperarSegundos(int segundos) throws InterruptedException{
		int milis = segundos * 1000;
		Thread.sleep(milis);
	}
	
	public void cerrarBrowser(){
		driver.close();
	}
	

}
