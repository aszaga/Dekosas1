package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class DekosasUserInterface {
	public static final  Target TXT_BUSCADOR_DEKOSAS = Target.the("").locatedBy("//input[@id ='search']");
	public static final  Target BTN_BUSCADOR_DEKOSAS = Target.the("").locatedBy("//form[@id='search_mini_form']//button[@class ='action search']");
	public static final  Target BTN_EMERGENTE_DEKOSAS = Target.the("").locatedBy("//div[@id='close-link-x']");
	public static final  Target BTN_PRODUCTO_DEKOSAS = Target.the("").locatedBy("//img[contains(@alt,'{0}')]");
	public static final  Target LBL_RESULTADO_DEKOSAS = Target.the("").locatedBy("//h1[contains(@class,'page-title')]");
	public static final  Target LBL_PRODUCTO_DEKOSAS = Target.the("").locatedBy("//h1[contains(@class,'page-title')]//span[contains(text(),'{0}')]");
	
	//XPaht Aleatorio
	public static final Target BTN_CATEGORIA_LAMPARA_DEKOSAS = Target.the("").locatedBy("//span[contains(text(),'Iluminación')]//ancestor ::a");
	public static final Target BTN_PRODUCTO_ALEATORIO_DEKOSAS = Target.the("").locatedBy("//child::div[@class='product-detail-content']/strong/a");
	public static final  Target BTN_FRAME_DEKOSAS = Target.the("").locatedBy("//div[@id='close-link-x']");
	public static final  Target BTN_ESTILO_DEKOSAS = Target.the("").locatedBy("//a[@href='https://dekosas.com/co/iluminacion?cat=533']");
	public static final Target LBL_NOMBRE_PRODUCTO_ALEATORIO_DEKOSAS = Target.the("").locatedBy("//child::div[@class='product-detail-content']/strong/a");
	

	

}

