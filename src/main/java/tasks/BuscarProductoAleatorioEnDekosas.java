package tasks;

import java.util.stream.Stream;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.SeleniumWebDriver;
import interactions.CambiarDeFrame;
import interactions.ClicProductoAleatorio;
import interactions.Esperar;
import interactions.VolverALaVentana;
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
					
				ClicProductoAleatorio.on()
				);	 
		
		
		
		JavascriptExecutor jse = (JavascriptExecutor)SeleniumWebDriver.driver;
		jse.executeScript("window.scrollBy(0,250)");
	}
	

		






	public static BuscarProductoAleatorioEnDekosas on() {
		return Instrumented.instanceOf(BuscarProductoAleatorioEnDekosas.class).withProperties();
	}

}
