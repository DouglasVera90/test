package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidades.Base;

public class RipleyCarroCompra extends Base {

	public RipleyCarroCompra(WebDriver driver)  {
		super(driver);	
	}
	
	//Identificadores
	
	//Identificador del boton aumentar cantidad
	By btnAumentar = By.xpath("//i[contains(@class,'fa fa-angle-up')]");
	
	//Identificador del texto del precio del producto en el carro de compra
	By txtPrecioCarro = By.xpath("//body/div[9]/div[1]/div[1]/div[2]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]");
	
	//Identificador del boton vaciar el carro de compra
	By btnVaciar = By.xpath("//div[contains(@class,'shopping-bag-item-actions')]//button");
	
	//Identificador del boton vaciar el carro de compra
	By txtVaciar = By.xpath("//div[contains(@class,'col-lg-8')]//header//h1");
	
	//Identificador del boton vaciar el carro de compra
	By btnDismiuir = By.xpath("//i[contains(@class,'fa fa-angle-down')]");
	
	//Identificador del nombre del primer producto 
	By txtPrimerProducto = By.xpath("//body[contains(@class,'')]/div[contains(@class,'cart-page')]/div[contains(@class,'container')]/div[contains(@class,'row')]/div[contains(@class,'col-lg-8')]/div[1]/div[1]/a[1]/div[2]/div[1]");
	
	//Identificador del nombre del segundo producto 
	By txtSegundoProducto = By.xpath("//body[contains(@class,'')]/div[contains(@class,'cart-page')]/div[contains(@class,'container')]/div[contains(@class,'row')]/div[contains(@class,'col-lg-8')]/div[2]/div[1]/a[1]/div[2]/div[1]");
			
	
	public String obtenerPrecio() throws InterruptedException {
		esperarSegundos(6);
		return obtenerTexto(txtPrecioCarro);
	}	
}
	
