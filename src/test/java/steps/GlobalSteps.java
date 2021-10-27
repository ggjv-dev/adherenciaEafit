package steps;

import pageObjects.Main;
import utilidades.Utilidades;

public class GlobalSteps {

    Main main;
    Utilidades utilidades;

    public void ingresarAlAplicativo() throws InterruptedException {
        main.open();
        utilidades.clickElemento(main.getBtnInicio());
        Thread.sleep(5000);
        utilidades.cambiarPestaña();
        utilidades.validarTexto(main.getLblInscribete());
        utilidades.validarTexto(main.getLblInfo());
        utilidades.validarTexto(main.getLblYaTienesCuenta());
        utilidades.validarTexto(main.getLblTodaviaNoCuenta());
    }

}
