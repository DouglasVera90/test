package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidades.Base;

public class RipleyHome extends Base {
	
	public RipleyHome(WebDriver driver)  {
		super(driver);
	}
	//Identificadores
	

	//Identificador boton cancelar pop-up
	By btnCancelar = By.id("onesignal-slidedown-cancel-button");
	
	//Identificador boton iniciar sesion
	By btnIniciarSesion = By.xpath("//a//span[@class='my-account__desktop']");
	
	//Identificador textbox rut
	By txtRut = By.xpath("//body/div[@id='navigation-header']/header[@id='ripley-sticky-header']/section/nav/ul/li/div/div/div/div/div/div/div/div/div/form/div/div/input[1]");

	//Identificador textbox contraseña
	By txtPassword = By.xpath("//div[@class='password-input-container']//input");

	//Identificador boton ingresar
	By btnIngresar = By.xpath("//button[contains(@class,'btn-ripley')]");
	
	//Identificador mensaje error
	By txtMensaje = By.className("message");
	
	//Identificador boton menu
	By btnMenu = By.xpath("//div[@class='menu-button__icon']");

	//Identificador boton electro
	By btnElectro = By.xpath("//a[@class='category-item-tecno']");
	
	//Identificador boton notebooks
	By btnnotebook = By.xpath("//a[@id='note_books']");
	
	
	public void menu() throws InterruptedException {
		//buscarElementoWebConEspera(btnCancelar);
		//click(btnCancelar);
		buscarElementoWebConEspera(btnMenu);
		click(btnMenu);
	}
	
	public void electro () throws InterruptedException {
		esperarElemento(2);
		click(btnElectro);
	}
	
	public void notebook () throws InterruptedException {
		esperarElemento(2);
		click(btnnotebook);
		esperarSegundos(2);
	}
}
