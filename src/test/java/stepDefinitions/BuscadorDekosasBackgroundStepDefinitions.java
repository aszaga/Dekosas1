package stepDefinitions;

import java.io.IOException;
import java.util.List;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Producto;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoEnDekosas;
import userInterface.DekosasUserInterface;
import variablesGlobales.VariablesGlobales;


public class BuscadorDekosasBackgroundStepDefinitions {
	
	@Before
	public void before() throws IOException {
		OnStage.setTheStage(new OnlineCast());
	}
	
	
	@When("^busco un producto en el buscador$")
	public void buscoUnProductoEnElBuscador(List<Producto> productos) {
		OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnDekosas.on(productos.get(0).getNombreProducto()));
	}
	@Then("^podre ver el producto buscado en la pantalla$")
	public void podreVerElProductoBuscadoEnLaPantalla() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(DekosasUserInterface.LBL_PRODUCTO_DEKOSAS.of(VariablesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));
	}
}



