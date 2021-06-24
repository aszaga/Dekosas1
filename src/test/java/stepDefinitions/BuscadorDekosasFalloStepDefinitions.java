package stepDefinitions;

import java.util.List;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import models.Producto;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoEnDekosas;
import userInterface.DekosasUserInterface;
import variablesGlobales.VariablesGlobales;

public class BuscadorDekosasFalloStepDefinitions {
	@Given("^inicializo la pagina Dekosas con la url https://dekosas.com/co/$")
	public void inicializoLaPaginaDekosasConLaUrlHttpsDekosasComCo() {
		OnStage.theActorCalled("Astrid").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on("https://dekosas.com/co/")));
	    
	}


	@When("^deseo un producto del buscador$")
	public void deseoUnProductoDelBuscador(List<Producto> productos) {
		OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnDekosas.on(productos.get(0).getNombreProducto()));
	   
	}

	@Then("^puedo validar el articulo en pantalla$")
	public void puedoValidarElArticuloEnPantalla() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
				WebElementQuestion
						.the(DekosasUserInterface.LBL_PRODUCTO_DEKOSAS.of(VariablesGlobales.nombreProductoAleatorio)),
				WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));
		
	   	}
	
	

}
