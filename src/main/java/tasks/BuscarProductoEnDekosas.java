package tasks;



import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.DekosasUserInterface;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import driver.SeleniumWebDriver;


public class BuscarProductoEnDekosas implements Task {
	private String producto;

	public BuscarProductoEnDekosas(String producto) {
		this.producto = producto;
}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				
				Enter.theValue(producto).into(DekosasUserInterface.TXT_BUSCADOR_DEKOSAS).thenHit(Keys.ENTER));    
				
				Click.on(DekosasUserInterface.BTN_BUSCADOR_DEKOSAS
				);
				JavascriptExecutor jse = (JavascriptExecutor)SeleniumWebDriver.driver;
				jse.executeScript("window.scrollBy(0,250)");
	}
	

	public static BuscarProductoEnDekosas on(String producto) {
		return Instrumented.instanceOf(BuscarProductoEnDekosas.class).withProperties(producto);
	}

}
