Feature: Adherencia
  Yo como arquitecto
  quiero interactuar con los elementos de la pagina
  para verificar que el framework es capaz de interactuar con elaplicativo

  Background:
    Given ingreso al aplicativo

  @ESC001
  Scenario: Crear cuenta
    Given ingreso a crear cuenta
    When carga el formulario de registro
    And ingreso los datos del formulario
    And registro los datos
    Then se crea mi cuenta

  @ESC002
  Scenario: Iniciar sesion
    Given ingreso a iniciar sesion
    When diligencio los datos de sesion
    Then ingreso al dashboard del aplicativo