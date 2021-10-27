package utilidades;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jruby.RubyProcess;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Utilidades extends PageObject {

    final String bordearRojo = "arguments[0].style.border='3px dashed red'";

    private static final Logger LOGGER = LoggerFactory.getLogger(Utilidades.class);

    public boolean elementoPresente(WebElementFacade webElementFacade) {
        try {
            webElementFacade.waitUntilPresent();
            moveToElement(webElementFacade);
            bordearElemento(webElementFacade);
            LOGGER.info("El elemento " + webElementFacade + " esta presente.");
            return (webElementFacade.isPresent());
        } catch (Exception e) {
            LOGGER.info("El elemento " + webElementFacade + " no esta presente: " + e);
            fail("El elemento " + webElementFacade + " no esta presente: " + e);
            return false;
        }
    }

    public void ingresarTexto(String texto, WebElementFacade webElementFacade) {
        try {
            if (elementoPresente(webElementFacade)) {
                webElementFacade.type(texto);
                LOGGER.info("se escribe: " + texto + " en el campo: " + webElementFacade);
                Serenity.takeScreenshot();
            }
        } catch (Exception e) {
            LOGGER.info("No se pudo escribir: " + texto + " en el campo: " + webElementFacade + " " + e);
            fail("No se pudo escribir: " + texto + " en el campo: " + webElementFacade + " " + e);
        }
    }

    public void clickElemento(WebElementFacade webElementFacade) {
        try {
            if (elementoPresente(webElementFacade)) {
                Serenity.takeScreenshot();
                webElementFacade.click();
                LOGGER.info("Se realiza click en el elemento: " + webElementFacade);
            }
        } catch (Exception e) {
            LOGGER.info("Elemento " + webElementFacade + " no esta presente en la pagina " + e);
            fail("Elemento " + webElementFacade + " no esta presente en la pagina " + e);
        }
    }

    public void bordearElemento(WebElementFacade webLocalizador) {
        ((JavascriptExecutor) getDriver()).executeScript(bordearRojo, webLocalizador);
    }

    public void moveToElement(WebElementFacade webElementFacade) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(webElementFacade);
        actions.perform();
    }

    public void validarTexto(WebElementFacade webElementFacade){
        try {
            if (elementoPresente(webElementFacade)){
                assertTrue(elementoPresente(webElementFacade));
                LOGGER.info("El texto es correcto");
            }
        }catch (Exception e){
            LOGGER.info("El texto no aparece en la pagina" + e);
            fail("El texto no aparece en la pagina" + e);
        }
    }

    public void cambiarPestaña() {
        ArrayList tabs = new ArrayList(getDriver().getWindowHandles());
        System.out.println(tabs);
        getDriver().switchTo().window((String) tabs.get(1));
    }
}
