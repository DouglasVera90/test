package tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RipleyCarroCompra;
import pages.RipleyCategoriaNotebook;
import pages.RipleyHome;
import pages.RipleyProducto;

public class CargarProductoStepDefinitions {
	
	private WebDriver driver;
	RipleyHome paginaInicialRipley;
	RipleyCategoriaNotebook paginaCategoriaNotebook;
	RipleyProducto paginaProducto;
	RipleyCarroCompra paginaCarroCompra;
	
	 @Before
	  public void before() {
		 paginaInicialRipley = new RipleyHome(driver);
		  driver = paginaInicialRipley.ConexionChromeDriver();
		  paginaCategoriaNotebook = new RipleyCategoriaNotebook(driver);
		  paginaProducto = new RipleyProducto (driver);
		  paginaCarroCompra = new RipleyCarroCompra (driver);   
	  }

	 @After
	  public void after() {
		  paginaInicialRipley.cerrarBrowser();
		}
	 
	@Given("^que el usuario esta en el sitio de Ripley$")
	public void que_el_usuario_esta_en_el_sitio_de_Ripley() throws Throwable {
		paginaInicialRipley.visitarSitio("https://simple.ripley.cl/");
	}
	
	@When("^el usuario hace click en el boton menu$")
	public void el_usuario_hace_click_en_el_boton_menu() throws Throwable {
		//data = dataDriven.getData("CP003_ripleyCargaCarritoCompra");
		paginaInicialRipley.menu();
	}

	@When("^el usuario hace click en el boton tecno$")
	public void el_usuario_hace_click_en_el_boton_tecno() throws Throwable {
		paginaInicialRipley.electro();
	}

	@When("^el usuario hace click en el boton Notebooks$")
	public void el_usuario_hace_click_en_el_boton_Notebooks() throws Throwable {
		paginaInicialRipley.notebook();
	}

	@When("^el usuario filtra por marca HP$")
	public void el_usuario_filtra_por_marca_HP() throws Throwable {
		paginaCategoriaNotebook.filtraMarcaHP();
	}

	@When("^el usuario hace click en el primer notebook de la lista$")
	public void el_usuario_hace_click_en_el_primer_notebook_de_la_lista() throws Throwable {
		paginaCategoriaNotebook.primerNotebook();
	}

	@When("^el usuario hace click en el boton agregar a la bolsa$")
	public void el_usuario_hace_click_en_el_boton_agregar_a_la_bolsa() throws Throwable {
		paginaProducto.cargaProductoCarroCompra();
	}

	@When("^el usuario hace click en el boton continuar$")
	public void el_usuario_hace_click_en_el_boton_continuar() throws Throwable {
		paginaProducto.continuar();
	}

	@When("^el usuario hace click en el boton bolsa de compra$")
	public void el_usuario_hace_click_en_el_boton_bolsa_de_compra() throws Throwable {
		paginaProducto.irAlCarro();
	}

	@When("^el usuario hace click el el boton ir a la bolsa$")
	public void el_usuario_hace_click_el_el_boton_ir_a_la_bolsa() throws Throwable {
		paginaProducto.irALaBolsa();
	}

	@Then("^el precio del producto es el esperado$")
	public void el_precio_del_producto_es_el_esperado(DataTable dataFeature) throws Throwable {
		List<String> dataPrueba = dataFeature.asList(String.class);
		Assert.assertTrue( paginaCarroCompra.obtenerPrecio().contains(dataPrueba.get(0).toString()));
	}

}
