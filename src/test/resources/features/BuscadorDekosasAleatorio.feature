Feature: HU001

  Scenario Outline: <Escenario>
    Given me encuentro en la pagina de Dekosas con la url <Url>
    When busco un producto aleatorio en la pagina
    Then podre ver un producto aleatorio en pantalla

    Examples: 
      | Escenario                                       | Url                     |
      | Buscar un producto aleatorio en Dekosas exitoso | https://dekosas.com/co/ |
