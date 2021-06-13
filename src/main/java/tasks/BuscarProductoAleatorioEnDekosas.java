package tasks;

import java.util.stream.Stream;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.SeleniumWebDriver;
import interactions.ClicProductoAleatorio;
import interactions.Esperar;
import interactions.IframeDekosas;
import io.vavr.control.Try;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import userInterface.DekosasUserInterface;


public class BuscarProductoAleatorioEnDekosas  implements Task {
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(DekosasUserInterface.BTN_CATEGORIA_LAMPARA_DEKOSAS),
				
				
				Click.on(DekosasUserInterface.BTN_ESTILO_DEKOSAS),
				Esperar.estosSegundos(60),
				
				//Switch.toFrame(0),
				Click.on(DekosasUserInterface.BTN_IFRAME_DEKOSAS),
				Esperar.estosSegundos(60),
				ClicProductoAleatorio.on()
				);	 
		
		
		
		JavascriptExecutor jse = (JavascriptExecutor)SeleniumWebDriver.driver;
		jse.executeScript("window.scrollBy(0,250)");
	}
	

		
//#picreel-frame





	public static BuscarProductoAleatorioEnDekosas on() {
		return Instrumented.instanceOf(BuscarProductoAleatorioEnDekosas.class).withProperties();
	}

}
