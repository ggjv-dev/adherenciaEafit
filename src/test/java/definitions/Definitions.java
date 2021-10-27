package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import steps.GlobalSteps;

public class Definitions {

    @Steps
    GlobalSteps globalSteps;

    @Given("ingreso al aplicativo")
    public void ingreso_al_aplicativo() throws InterruptedException {
        globalSteps.ingresarAlAplicativo();
    }
    @Given("ingreso a crear cuenta")
    public void ingreso_a_crear_cuenta() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("carga el formulario de registro")
    public void carga_el_formulario_de_registro() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("ingreso los datos del formulario")
    public void ingreso_los_datos_del_formulario() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("registro los datos")
    public void registro_los_datos() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("se crea mi cuenta")
    public void se_crea_mi_cuenta() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("ingreso a iniciar sesion")
    public void ingreso_a_iniciar_sesion() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("diligencio los datos de sesion")
    public void diligencio_los_datos_de_sesion() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("ingreso al dashboard del aplicativo")
    public void ingreso_al_dashboard_del_aplicativo() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
