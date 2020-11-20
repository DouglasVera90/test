package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidades.Base;

public class RipleyProducto extends Base {

	public RipleyProducto(WebDriver driver)  {
		super(driver);
	}
	//Identificadores
		
	//Identificador nombre notebook
	By txtNombreNotebook = By.xpath("//div[@id='row']//div//section//h1");
	
	//Identificador boton cancelar
	By btnCancelar = By.id("onesignal-slidedown-cancel-button");
	
	//Identificador del contenedor
	By contenedor = By.xpath("//div[@id='row']//p[2]");
	
	//Identificador del boton agregar a la bolsa
	By btnComprar = By.xpath("//button[contains(text(),'Agregar a la bolsa')]");
	
	//Identificador del boton continuar
	By btnContinuar = By.xpath("//button[contains(text(),'Continuar')]");
	
	//Identificador de la bolsa de compra
	By btnCarro = By.xpath("//li[contains(@class,'ripley-header__shopping-bag-container')]//div//a//*[local-name()='svg']");
	
	//Identificador del precio que se muestra en el carro de compra
	By txtPrecioCarro = By.xpath("//div[@id='shopping-bag-slideout']//div[3]//div[2]");
							
	//Identificador del boton ir a la bolsa
	By btnIrBolsa = By.xpath("//a[contains(@class,'btn btn-ripley')]");
	
	//Identificador del checkbox garantia extendida
	By chkGarantia = By.xpath("//div[contains(@class,'radio-item-options display-all')]//div[1]//input[1]");
		
	
	public void cargaProductoCarroCompra() throws InterruptedException {
		esperarSegundos(2);
		click(contenedor);
		esperarElemento(1);
		click(btnComprar);
		
	}
	
	public void continuar_() throws InterruptedException {
		esperarElemento(2);
		click(btnContinuar);
		esperarSegundos(4);
		buscarElementoWebConEspera(btnCancelar);
		click(btnCancelar);
	}
	
	public void irAlCarro() throws InterruptedException {
		esperarSegundos(4);
		click(btnCarro);
	}
	
	public void irALaBolsa() throws InterruptedException {
		esperarElemento(2);
		click(btnIrBolsa);
		esperarSegundos(1);
	}
}
