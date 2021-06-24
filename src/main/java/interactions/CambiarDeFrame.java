package interactions;

import driver.SeleniumWebDriver;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CambiarDeFrame implements Interaction {

    private int indexFrame;


    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean validacionFrame = false;
        while (validacionFrame == false) {
            try {
            	BrowseTheWeb.as(actor).getDriver().switchTo().frame(indexFrame);
                validacionFrame = true;
            } catch (Exception e) {

            }
        }
    }

    public static Performable on(int indexFrame){
        return Instrumented.instanceOf(CambiarDeFrame.class).withProperties(indexFrame);
    }

}