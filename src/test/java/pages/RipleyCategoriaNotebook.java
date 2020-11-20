package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilidades.Base;

public class RipleyCategoriaNotebook extends Base {
	
	public RipleyCategoriaNotebook(WebDriver driver)  {
		super(driver);
	}
	//Identificadores
	 
	//Identificador checkbox hp
	By btnHP = By.xpath("//body/div[9]/div[1]/div[1]/div[2]/div[2]/aside[1]/section[1]/div[1]/section[1]/div[1]/ul[1]/li[5]/a[1]/span[1]");
	
	//Identificador primer notebook de la lista
	By btnPrimernnotebookhp = By.xpath("//body/div/div/div/div/div/section/div/div/a[1]/div[2]/div[2]");
	
	//Identificador contenedor
	By contenedor = By.xpath("//div[contains(@class,'catalog-page')]//section[2]//h5[1]");
	
	//Identificador segundo notebook de la lista
	By btnSegundonotebookhp = By.xpath("//body/div/div/div/div/div/section/div/div/a[2]/div[2]/div[2]");
		
	
	//Identificador boton cancelar pop-up
	By btnCancelar = By.id("onesignal-slidedown-cancel-button");
	
	public void filtraMarcaHP() throws InterruptedException {
		esperarSegundos(2);
		click(contenedor);
		esperarElemento(2);
		click(btnHP);
	}
	
	public void primerNotebook() throws InterruptedException {
		esperarElemento(2);
		click(btnPrimernnotebookhp);
	}
}
