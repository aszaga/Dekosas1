package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoEnDekosas;
import userInterface.DekosasUserInterface;

public class BuscadorDekosasStepDefinitions {
	

@Before
public void before() throws IOException{
	OnStage.setTheStage(new OnlineCast());
}

@Given("^me encuentro en la pagina de Dekosas con la url (.*)$")
public void meEncuentroEnLaPaginaDeDekosasConLaUrlHttpsDekosasComCo(String url) {
	OnStage.theActorCalled("Astrid").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(url)));
}


@When("^busco el producto (.*) en el buscador$")
public void buscoElProductoLicuadoraManualNegraBodumEnElBuscador(String producto) {
	OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnDekosas.on(producto));
}

@Then("^podre ver el producto (.*) en la pantalla$")
public void podreVerElProductoLicuadoraManualNegraBodumEnLaPantalla(String producto) {
	OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(DekosasUserInterface.LBL_PRODUCTO_DEKOSAS.of(producto)),
			WebElementStateMatchers.containsText(producto)));
}


	}




