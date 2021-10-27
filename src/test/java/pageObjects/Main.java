package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.annotation.Target;

@DefaultUrl("https://mcurequestdbqa.z13.web.core.windows.net")
public class Main extends PageObject {
    public WebElementFacade getBtnInicio() {
        return btnInicio;
    }

    @FindBy(xpath = "//*[@id=\"mainbutton\"]")
    WebElementFacade btnInicio;

    public WebElementFacade getLblInscribete() {
        return lblInscribete;
    }

    @FindBy(xpath = "//*[contains(text(),'Inscríbete')]")
    WebElementFacade lblInscribete;

    public WebElementFacade getLblInfo() {
        return lblInfo;
    }

    @FindBy(xpath = "//*[contains(text(),'Para inscribirte debes tener una cuenta')]")
    WebElementFacade lblInfo;

    public WebElementFacade getLblYaTienesCuenta() {
        return lblYaTienesCuenta;
    }

    @FindBy(xpath = "//*[contains(text(),'¿Ya tienes una cuenta?')]")
    WebElementFacade lblYaTienesCuenta;

    public WebElementFacade getLblTodaviaNoCuenta() {
        return lblTodaviaNoCuenta;
    }

    @FindBy(xpath = "//*[contains(text(),' ¿Todavía no tienes una cuenta?')]")
    WebElementFacade lblTodaviaNoCuenta;

    public WebElementFacade getLinkCrearCuenta() {
        return linkCrearCuenta;
    }

    @FindBy(xpath = "//*[@id=\"registerlink\"]")
    WebElementFacade linkCrearCuenta;

    public WebElementFacade getLblValidarPaginaCrearCuenta() {
        return lblValidarPaginaCrearCuenta;
    }

    @FindBy(xpath = "//*[contains(text(),'Crear una cuenta')]")
    WebElementFacade lblValidarPaginaCrearCuenta;
}
