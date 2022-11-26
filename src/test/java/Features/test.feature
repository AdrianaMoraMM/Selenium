Feature: Categoria Comico
  Como usuario quiero leer chistes para reirme un rato

  Scenario: Ingresar a la categoria Comics desde la pantalla Home
    Given El usuario  se encuentra en la pantalla de home de imallitertease
    When Hace click sobre el boton The little tester comics
    Then Se debe redirigir a la pantalla de comics
    And debe ver todos los comics que se encuentran

  Scenario: Ingresar a la categoria Comics desde la pantalla Home
    Given El usuario  se encuentra en la pantalla de home de imallitertease
    When Hace click sobre el boton The little tester comics
    Then Se debe redirigir a la pantalla de comics
    And debe ver todos los comics que se encuentran